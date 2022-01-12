@org.springframework.web.bind.annotation.RequestMapping(value = "/answer5", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public org.springframework.web.servlet.ModelAndView finalResults(@org.springframework.web.bind.annotation.ModelAttribute(value = "activityQuery")
com.krho.finalproject.ActivityQuery actQuery, java.util.Map<java.lang.String, java.lang.Object> model) {
    com.krho.finalproject.Activity activity = new com.krho.finalproject.Activity();
    java.lang.System.out.println(activity.buildQuery(actQuery));
    java.util.List<com.krho.finalproject.Activity> activities = com.krho.finalproject.DAO.getActivities(activity.buildQuery(actQuery));
    java.util.Collections.shuffle(activities);
    return new org.springframework.web.servlet.ModelAndView("results", "finalQuery", activities);
}