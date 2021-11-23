@org.springframework.web.bind.annotation.RequestMapping(value = "/addCandidateInfo", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String addCandidateInfo(ua.com.jobsukraine.entity.Candidate candidate) {
    java.lang.System.out.println(candidate);
    java.lang.System.out.println(candidate.getLastName());
    return "regcandidate/RegCandidateTwo";
}