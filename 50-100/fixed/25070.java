private uk.ac.ebi.metabolights.webservice.controllers.Citation pubMedResultToCitation(uk.ac.ebi.metabolights.webservice.controllers.Result result) {
    uk.ac.ebi.metabolights.webservice.controllers.Citation newCitation = new uk.ac.ebi.metabolights.webservice.controllers.Citation();
    newCitation.setTitle(result.getTitle());
    newCitation.setAbstracT(result.getAbstractText());
    newCitation.setId(result.getId());
    newCitation.setAuthorsText(result.getAuthorString());
    return newCitation;
}