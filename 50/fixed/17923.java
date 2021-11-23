@webdoctor.controller.RequestMapping(path = "/EditDescription", method = RequestMethod.POST)
@webdoctor.controller.ResponseBody
public int EditDescription(@webdoctor.controller.RequestBody
webdoctor.jooq.tables.pojos.Disease disease) {
    return DS.descriptionEdit(disease);
}