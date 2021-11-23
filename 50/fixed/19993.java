@webdoctor.controller.RequestMapping(path = "CreateDescription", method = RequestMethod.POST)
@webdoctor.controller.ResponseBody
public int CreateDescription(@webdoctor.controller.RequestBody
webdoctor.helperClass.Disease_Symptoms D) {
    return DS.descriptionCreate(D, (-1), null);
}