@org.springframework.web.bind.annotation.RequestMapping(value = "/form/page_view.html", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String viewPage(@org.springframework.web.bind.annotation.RequestParam
java.lang.Integer id, @org.springframework.web.bind.annotation.RequestParam
java.lang.Integer p, org.springframework.ui.ModelMap models) {
    formbuilder.model.Form form = formDao.getForm(id);
    java.util.List<formbuilder.model.Page> pages = form.getPages();
    formbuilder.model.Page page = null;
    if (p >= 1) {
        page = pages.get((p - 1));
    }else {
        page = pages.get(0);
    }
    models.put("page", page);
    models.put("form", form);
    return "form/pageview";
}