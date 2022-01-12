@kjkpvik.controlers.RequestMapping(value = "/update", method = RequestMethod.POST)
public org.springframework.http.ResponseEntity update(@kjkpvik.controlers.RequestBody
kjkpvik.viewmodels.KorisnikVM userVM, java.security.Principal principal) {
    try {
        return org.springframework.http.ResponseEntity.status(HttpStatus.OK).body(korisnikService.update(userVM, principal.getName()));
    } catch (org.hibernate.service.spi.ServiceException e) {
        return org.springframework.http.ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getLocalizedMessage());
    }
}