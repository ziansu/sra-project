@org.springframework.web.bind.annotation.RequestMapping(value = "/ocorrencias", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public br.gov.sibbr.api.model.Result occurrence(@org.springframework.web.bind.annotation.RequestParam(value = "scientificname", defaultValue = "")
java.lang.String scientificname, @org.springframework.web.bind.annotation.RequestParam(value = "ignoreNullCoordinates", defaultValue = "false")
java.lang.String ignorenullcoordinates, @org.springframework.web.bind.annotation.RequestParam(value = "limit", defaultValue = "0")
java.lang.String limit) {
    java.util.ArrayList<br.gov.sibbr.api.model.Occurrence> occurrences = null;
    int intLimit = java.lang.Integer.parseInt(limit);
    if (ignorenullcoordinates.equalsIgnoreCase("false")) {
        occurrences = service.fetchOccurrences(scientificname, false, intLimit);
    }else {
        occurrences = service.fetchOccurrences(scientificname, true, intLimit);
    }
    return new br.gov.sibbr.api.model.Result(scientificname, occurrences);
}