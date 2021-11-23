@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.GET)
@org.springframework.web.bind.annotation.ResponseStatus(value = org.springframework.http.HttpStatus.OK)
public java.util.List<lt.javainiai.model.CandidatesResultsRatingEntity> findAll() {
    return candidatesResultsService.findAll();
}