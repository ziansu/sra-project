@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.POST, consumes = pt.ist.learning.ui.PagesAdminController.JSON_VALUE)
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.String create(@org.springframework.web.bind.annotation.PathVariable
java.lang.String siteId, @org.springframework.web.bind.annotation.RequestBody
java.lang.String bodyJson) {
    pt.ist.learning.ui.PagesAdminBean bean = new pt.ist.learning.ui.PagesAdminBean(bodyJson);
    org.fenixedu.cms.domain.Site site = pt.ist.learning.ui.PagesAdminController.site(siteId);
    java.util.Optional<org.fenixedu.cms.domain.MenuItem> menuItem = service.create(site, bean.getParent(), bean.getTitle(), bean.getBody(), bean.getPosition());
    return service.serialize(menuItem.get(), true).toString();
}