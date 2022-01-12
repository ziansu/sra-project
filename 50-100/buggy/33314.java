@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.PUT, consumes = pt.ist.learning.ui.PagesAdminController.JSON_VALUE)
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.String edit(@org.springframework.web.bind.annotation.RequestBody
java.lang.String bodyJson) {
    pt.ist.learning.ui.PagesAdminBean bean = new pt.ist.learning.ui.PagesAdminBean(bodyJson);
    org.fenixedu.cms.domain.MenuItem menuItem = service.edit(bean.getMenuItem(), bean.getParent(), bean.getTitle(), bean.getBody(), bean.getPosition(), bean.getCanViewGroup());
    return service.serialize(menuItem, true).toString();
}