@com.greenfox.kryptonite.projectx.controller.RequestMapping(value = "/pageviews", method = RequestMethod.GET)
public com.greenfox.kryptonite.projectx.model.pageviews.PageViewFormat pageviews() throws java.lang.Exception {
    pageViewService.addAttributeToDatabase(eventToDatabaseRepository);
    return assembler.returnPageView(eventToDatabaseRepository);
}