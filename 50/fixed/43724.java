@org.springframework.web.bind.annotation.RequestMapping(value = "/api/compare", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public boolean compare() {
    urlService.setOwnerRepoBranchFile("prolific-idea", "Code-Off-App", "master", "pom.xml");
    java.lang.String solution = urlService.getContent();
    return urlService.compareSolution(solution, 1);
}