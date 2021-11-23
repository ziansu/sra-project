@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.POST, consumes = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
@org.springframework.web.bind.annotation.ResponseStatus(value = org.springframework.http.HttpStatus.CREATED)
public lt.javainiai.model.CandidatesResultsRatingEntity save(@javax.validation.Valid
@org.springframework.web.bind.annotation.RequestBody
lt.javainiai.model.CandidatesResultsRatingEntity candidatesResults) {
    return this.candidatesResultsService.saveOrUpdate(candidatesResults);
}