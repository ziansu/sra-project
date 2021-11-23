@org.springframework.web.bind.annotation.RequestMapping(value = "/delete")
@org.springframework.web.bind.annotation.ResponseBody
public com.ccloomi.core.common.bean.Message deleteRole(java.lang.String id) {
    com.ccloomi.core.common.bean.Message m = new com.ccloomi.core.common.bean.Message();
    roleService.delete(id);
    m.setCode("0");
    return m;
}