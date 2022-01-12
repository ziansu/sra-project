@org.springframework.web.bind.annotation.RequestMapping(value = "/fetchmpid", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public org.springframework.http.ResponseEntity<java.lang.String> fetchmpid(@org.springframework.web.bind.annotation.RequestParam(value = "name", required = true)
java.lang.String termName, javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, org.springframework.ui.Model model) throws java.lang.Exception {
    java.lang.System.out.println(("****" + termName));
    uk.ac.ebi.phenotype.web.controller.Mp mp = mpRepository.findByMpTerm(termName);
    java.lang.System.out.println(mp.toString());
    return new org.springframework.http.ResponseEntity<java.lang.String>(mp.getMpId(), createResponseHeaders(), org.springframework.http.HttpStatus.CREATED);
}