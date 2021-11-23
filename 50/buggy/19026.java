@controller.RequestMapping(value = "/getGroupNumberOfPayments", method = RequestMethod.GET)
@controller.ResponseBody
public int getGroupNumberOfPayments(@controller.RequestParam(value = "idGroupregistration")
java.lang.Integer id, @controller.RequestParam(value = "description")
java.lang.String description) {
    java.lang.System.out.println("Kommer hit... getGroupNumberOfPayments.. ");
    return courseService.getGroupNumberOfPayments(id, description);
}