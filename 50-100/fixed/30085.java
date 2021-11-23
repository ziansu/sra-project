@io.swagger.annotations.ApiOperation(value = "Get co-occurring term information for a single GO Term id.", notes = "If possible, response fields include: id, name, definition, probability ratio, similarity ratio," + " together, compared.")
@uk.ac.ebi.quickgo.ontology.controller.RequestMapping(value = (uk.ac.ebi.quickgo.ontology.controller.CoTermController.COTERMS_RESOURCE) + "/{id}", method = RequestMethod.GET, produces = { org.springframework.http.MediaType.APPLICATION_JSON_VALUE })
public org.springframework.http.ResponseEntity<uk.ac.ebi.quickgo.rest.search.results.QueryResult<uk.ac.ebi.quickgo.ontology.common.coterm.CoTerm>> findCoTerms(@uk.ac.ebi.quickgo.ontology.controller.PathVariable(value = "id")
java.lang.String id, @uk.ac.ebi.quickgo.ontology.controller.RequestParam(value = "source", defaultValue = "ALL")
java.lang.String source, @uk.ac.ebi.quickgo.ontology.controller.RequestParam(value = "limit", required = false)
java.lang.String limit, @uk.ac.ebi.quickgo.ontology.controller.RequestParam(value = "similarityThreshold", defaultValue = "0.0")
float similarityThreshold) {
    uk.ac.ebi.quickgo.ontology.common.coterm.CoTermSource coTermSource = validateCoTermSource(source);
    validateGoTerm(id);
    return getResultsResponse(ontologyService.findCoTermsByOntologyId(id, coTermSource, coTermLimit.workoutLimit(limit), similarityThreshold));
}