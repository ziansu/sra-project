@org.springframework.web.bind.annotation.RequestMapping(value = "repair/updatePhone")
@org.springframework.web.bind.annotation.ResponseBody
public cn.zhku.zhkulife.utils.Beans.Message updatePhone(java.lang.String phone) throws java.lang.Exception {
    cn.zhku.zhkulife.po.entity.Admin admin = new cn.zhku.zhkulife.po.entity.Admin();
    org.apache.shiro.subject.Subject subject = org.apache.shiro.SecurityUtils.getSubject();
    cn.zhku.zhkulife.po.entity.Admin adminCache = ((cn.zhku.zhkulife.po.entity.Admin) (subject.getPrincipal()));
    admin.setAdminId(adminCache.getAdminId());
    if ((adminService.update(admin)) != 1)
        return new cn.zhku.zhkulife.utils.Beans.Message("2", "修改手机号码失败");
    else {
        admin.setAdminPhone(phone);
        return new cn.zhku.zhkulife.utils.Beans.Message("1", "修改手机号码成功");
    }
}