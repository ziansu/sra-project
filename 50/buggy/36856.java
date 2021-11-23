@org.springframework.web.bind.annotation.RequestMapping(value = "{id}", method = org.springframework.web.bind.annotation.RequestMethod.GET)
@org.springframework.web.bind.annotation.ResponseStatus(value = org.springframework.http.HttpStatus.OK)
public lt.javainiai.model.CandidatesResultsRatingEntity findById(@javax.validation.Valid
@org.springframework.web.bind.annotation.PathVariable(value = "id")
java.lang.Long id) {
    return this.candidatesResultsService.findById(id);
}