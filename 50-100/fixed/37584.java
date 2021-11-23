@org.springframework.web.bind.annotation.RequestMapping(value = "/{name:(?!link|home|login|users).*}", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public org.springframework.http.ResponseEntity<?> redirectTo(@org.springframework.web.bind.annotation.PathVariable
java.lang.String name, javax.servlet.http.HttpServletRequest request) {
    urlshortener2015.goldenbrown.controller.UrlShortenerControllerWithLogs.logger.info(("Requested redirection with hash " + name));
    urlshortener2015.goldenbrown.domain.ShortURL l = shortURLRepositoryExtended.findByKey(name);
    if (l != null) {
        createAndSaveClick(extractIP(request), name);
        return createSuccessfulRedirectToResponse(l);
    }else {
        return new org.springframework.http.ResponseEntity(org.springframework.http.HttpStatus.NOT_FOUND);
    }
}