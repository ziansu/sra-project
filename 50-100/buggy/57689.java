@org.springframework.security.access.prepost.PreAuthorize(value = "!hasRole('ROLE_ANONYMOUS')")
@org.springframework.web.bind.annotation.RequestMapping(value = "/usStates", method = org.springframework.web.bind.annotation.RequestMethod.GET, produces = "application/json")
@org.springframework.web.bind.annotation.ResponseBody
public org.springframework.http.ResponseEntity<org.hanbo.web.app.entities.config.USState[]> getAllUSStates() {
    org.springframework.http.HttpHeaders respHeader = new org.springframework.http.HttpHeaders();
    respHeader.setContentType(MediaType.APPLICATION_JSON);
    org.hanbo.web.app.entities.config.USState[] retVal = usStatesService.getAllUSStates();
    org.springframework.http.ResponseEntity<org.hanbo.web.app.entities.config.USState[]> retResp = new org.springframework.http.ResponseEntity<org.hanbo.web.app.entities.config.USState[]>(retVal, respHeader, org.springframework.http.HttpStatus.OK);
    return retResp;
}