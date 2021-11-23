@org.apache.shiro.authz.annotation.RequiresPermissions(value = "bussiness:userInfo:view")
@org.springframework.web.bind.annotation.RequestMapping(value = "addmedia")
public java.lang.String addMedia(com.ggj.article.module.business.bean.UserInfo userInfo, org.springframework.ui.Model model) {
    model.addAttribute("userInfo", userInfoService.getMedia(userInfo));
    return "bussiness/userInfo/bussiness_userInfo_media";
}