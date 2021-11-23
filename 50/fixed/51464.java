@controller.RequestMapping(value = "/getCountRegistrations", method = RequestMethod.GET)
@controller.ResponseBody
public int getCountRegistrations(@controller.RequestParam(value = "course_id")
int id) {
    int i = courseService.getCountRegistrations(id);
    return i;
}