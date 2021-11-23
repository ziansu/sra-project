@org.springframework.web.bind.annotation.GetMapping(value = "/find")
@org.springframework.web.bind.annotation.ResponseBody
public java.util.List<com.codecool.volunti.model.Opportunity> findOpportunities() {
    log.info("opportunityRepository.findAll()");
    return ((java.util.List<com.codecool.volunti.model.Opportunity>) (opportunityRepository.findAll()));
}