@org.springframework.web.bind.annotation.RequestMapping(value = "/add")
public java.lang.String addActivityInDatabase(org.springframework.ui.Model model, @org.springframework.web.bind.annotation.RequestParam
java.lang.String title, @org.springframework.web.bind.annotation.RequestParam
java.lang.String text, @org.springframework.web.bind.annotation.RequestParam
java.lang.String state, @org.springframework.web.bind.annotation.RequestParam
java.lang.String location, @org.springframework.web.bind.annotation.RequestParam
int restriction, @org.springframework.web.bind.annotation.RequestParam
java.lang.String type) {
    at.fh.swenga.project.model.Subcategory s = subcategoryRepository.findByName(type);
    at.fh.swenga.project.model.Activity a = new at.fh.swenga.project.model.Activity(s, location, state, text, title, restriction);
    activityRepository.save(a);
    return "forward:listActivities";
}