@org.springframework.web.bind.annotation.RequestMapping(value = "/person/{personKey}/vote", method = org.springframework.web.bind.annotation.RequestMethod.POST, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
public org.springframework.http.ResponseEntity<computer.lanoel.communication.ResponseObject> vote(@org.springframework.web.bind.annotation.RequestHeader(required = false)
org.springframework.http.HttpHeaders requestHeaders, @org.springframework.web.bind.annotation.PathVariable
java.lang.Long personKey, @org.springframework.web.bind.annotation.RequestBody
computer.lanoel.contracts.Vote vote, javax.servlet.http.HttpServletRequest request) throws java.lang.Exception, java.lang.NumberFormatException {
    computer.lanoel.platform.PreEventManager pem = new computer.lanoel.platform.PreEventManager(computer.lanoel.communication.HttpHelper.getUserFromRequest(request));
    pem.vote(vote, personKey);
    computer.lanoel.steam.SteamCache.instance().refreshVotesCache();
    computer.lanoel.communication.ResponseObject ro = new computer.lanoel.communication.ResponseObject();
    ro.message = "Vote counted!";
    return new org.springframework.http.ResponseEntity<computer.lanoel.communication.ResponseObject>(ro, computer.lanoel.communication.HttpHelper.commonHttpHeaders(pem.getSessionIdForUser()), org.springframework.http.HttpStatus.OK);
}