@org.springframework.web.bind.annotation.RequestMapping(value = "/edit", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String submitContent(@org.springframework.web.bind.annotation.RequestParam(value = "content", required = true)
final java.lang.String content, final org.springframework.ui.Model model) {
    try {
        this.staticContentService.submitContent(this.uniqueReference, org.apache.commons.lang3.StringEscapeUtils.escapeXml(content));
    } catch (java.lang.RuntimeException re) {
        org.molgenis.ui.controller.AbstractStaticContentController.LOG.error("", re);
        model.addAttribute("errorMessage", org.molgenis.ui.controller.AbstractStaticContentController.ERRORMESSAGE_SUBMIT);
    }
    return this.initEditView(model);
}