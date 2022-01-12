@com.jobmatch.controllers.RequestMapping(value = "/create", method = RequestMethod.GET)
public java.lang.String createJob(org.springframework.ui.Model model) {
    com.jobmatch.models.JobPost newJobPost = new com.jobmatch.models.JobPost();
    model.addAttribute("title", "Create job post");
    model.addAttribute("skills", new com.jobmatch.viewmodels.RankMap(newJobPost.getSkills()));
    model.addAttribute("skillOptions", skillRepository.getMap());
    model.addAttribute("jobPost", newJobPost);
    model.addAttribute("countries", com.jobmatch.models.JobPost.getCountries());
    return "/jobs/edit";
}