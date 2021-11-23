@uk.ac.ebi.metabolights.webservice.controllers.RequestMapping(value = ("{studyIdentifier:" + (uk.ac.ebi.metabolights.webservice.controllers.StudyController.METABOLIGHTS_ID_REG_EXP)) + "}/getMetExploreMappingData")
@uk.ac.ebi.metabolights.webservice.controllers.ResponseBody
public uk.ac.ebi.metabolights.repository.model.webservice.RestResponse getMetExploreMappingData(@uk.ac.ebi.metabolights.webservice.controllers.PathVariable(value = "studyIdentifier")
java.lang.String studyIdentifier) throws uk.ac.ebi.metabolights.repository.dao.hibernate.DAOException {
    uk.ac.ebi.metabolights.webservice.controllers.StudyController.logger.info((("Requesting " + studyIdentifier) + "MetExplore Mapping Data"));
    uk.ac.ebi.metabolights.repository.model.webservice.RestResponse response = new uk.ac.ebi.metabolights.repository.model.webservice.RestResponse();
    java.lang.String MetExploreJSONFileName = (((uk.ac.ebi.metabolights.webservice.utils.PropertiesUtil.getProperty("studiesLocation")) + studyIdentifier) + (java.io.File.separator)) + "metexplore_mapping.json";
    uk.ac.ebi.metabolights.repository.dao.filesystem.MetExploreDAO metexploredao = new uk.ac.ebi.metabolights.repository.dao.filesystem.MetExploreDAO();
    java.lang.String MetExplorePathwaysMAppingData = metexploredao.getMetExploreJSONData(MetExploreJSONFileName, studyIdentifier);
    response.setContent(MetExplorePathwaysMAppingData);
    return response;
}