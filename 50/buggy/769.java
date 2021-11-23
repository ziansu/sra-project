@org.springframework.web.bind.annotation.RequestMapping(value = "/editTestSuit", method = org.springframework.web.bind.annotation.RequestMethod.POST, consumes = "application/json")
public org.springframework.http.ResponseEntity editSuit(@org.springframework.web.bind.annotation.RequestBody
com.epam.test_generator.entities.Suit suit) {
    suitService.editSuit(suit);
    return new org.springframework.http.ResponseEntity<java.lang.Void>(org.springframework.http.HttpStatus.OK);
}