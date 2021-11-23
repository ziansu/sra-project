@uk.ac.ebi.metabolights.webservice.controllers.RequestMapping(value = (uk.ac.ebi.metabolights.webservice.controllers.GenericCompoundWSController.COMPOUND_NAME_MAPPING) + "/{compoundName}")
@uk.ac.ebi.metabolights.webservice.controllers.ResponseBody
public uk.ac.ebi.metabolights.repository.model.webservice.RestResponse<java.util.List<uk.ac.ebi.metabolights.webservice.controllers.CompoundSearchResult>> getCompoundByName(@uk.ac.ebi.metabolights.webservice.controllers.PathVariable(value = "compoundName")
final java.lang.String compoundName) {
    uk.ac.ebi.metabolights.webservice.controllers.GenericCompoundWSController.logger.info(("Searching by compound name " + compoundName));
    uk.ac.ebi.metabolights.repository.model.webservice.RestResponse<java.util.List<uk.ac.ebi.metabolights.webservice.controllers.CompoundSearchResult>> response = new uk.ac.ebi.metabolights.repository.model.webservice.RestResponse();
    java.util.List<uk.ac.ebi.metabolights.webservice.controllers.CompoundSearchResult> searchHits = getSearchHitsFromListChebIAndChemSpiderOnly((compoundName.contains("(+)") ? compoundName : uk.ac.ebi.metabolights.webservice.controllers.Utilities.decode(compoundName)));
    response.setContent(searchHits);
    return response;
}