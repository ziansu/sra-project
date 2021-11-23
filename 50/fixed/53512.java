@org.springframework.web.bind.annotation.RequestMapping(value = "/regCandidateNew", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String register(@org.springframework.web.bind.annotation.ModelAttribute(value = "candidate")
ua.com.jobsukraine.entity.Candidate candidate, org.springframework.validation.BindingResult result) {
    cs.add(candidate);
    return "welcome";
}