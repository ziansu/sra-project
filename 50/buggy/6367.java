@org.springframework.web.bind.annotation.RequestMapping(value = "{datasetDefinitionName}/schema", method = org.springframework.web.bind.annotation.RequestMethod.POST)
java.lang.String getDatasetSchema(@org.springframework.web.bind.annotation.PathVariable(value = "datasetDefinitionName")
java.lang.String datasetDefinitionName, @org.springframework.web.bind.annotation.RequestBody
org.talend.components.service.rest.dto.DatasetConnectionInfo formData) throws com.fasterxml.jackson.core.JsonProcessingException;