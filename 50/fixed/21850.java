@webdoctor.controller.RequestMapping(path = "/SignUp", method = RequestMethod.POST)
@webdoctor.controller.ResponseBody
public int SignUp(@webdoctor.controller.RequestBody
webdoctor.jooq.tables.pojos.User user) {
    java.lang.System.out.println("Success");
    java.lang.System.out.println(user);
    return 1;
}