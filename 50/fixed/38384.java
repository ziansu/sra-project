@org.springframework.web.bind.annotation.RequestMapping(value = "/extractlocations", method = org.springframework.web.bind.annotation.RequestMethod.POST)
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.Iterable<java.lang.String> getLocations(@org.springframework.web.bind.annotation.RequestBody
java.lang.String locations) {
    return ner.getLocations(locations, false);
}