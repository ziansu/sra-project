@org.springframework.web.bind.annotation.RequestMapping(value = "/myEstates/size", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public org.springframework.http.ResponseEntity<com.nekretnine.dto.ResponseDTO> myEstates(java.security.Principal principal) {
    com.nekretnine.models.Customer customer = ((com.nekretnine.models.Customer) (userService.findByUsername(principal.getName())));
    int size = advertisementService.findBySoldto(customer);
    return new org.springframework.http.ResponseEntity(new com.nekretnine.dto.ResponseDTO(("" + size)), org.springframework.http.HttpStatus.OK);
}