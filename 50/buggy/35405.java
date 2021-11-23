@controller.RequestMapping(value = "/getRegistrations", method = RequestMethod.GET)
@controller.ResponseBody
public java.util.ArrayList<controller.Registration> getRegistration(@controller.RequestParam(value = "course_id")
int id) {
    java.lang.System.out.println("PÅMELDING HER: *****************");
    java.lang.System.out.println(courseService.getRegistrations(id).toString());
    return courseService.getRegistrations(id);
}