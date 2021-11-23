@org.springframework.web.bind.annotation.RequestMapping(value = "{id}", method = org.springframework.web.bind.annotation.RequestMethod.GET, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
public org.springframework.http.ResponseEntity<?> get(@org.springframework.web.bind.annotation.PathVariable(value = "id")
java.lang.Long id) {
    br.com.campanha.model.Campaign campaign = campaignService.findOne(id);
    if (campaign == null) {
        br.com.campanha.dto.MessageDTO message = new br.com.campanha.dto.MessageDTO();
        message.setMessage(environment.getProperty("message.campaign.notFound"));
        return new org.springframework.http.ResponseEntity(org.springframework.http.HttpStatus.NOT_FOUND);
    }else {
        return new org.springframework.http.ResponseEntity<br.com.campanha.model.Campaign>(campaign, org.springframework.http.HttpStatus.OK);
    }
}