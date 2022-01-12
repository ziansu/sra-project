@retrofit2.http.GET(value = ((((com.dataloom.data.DataApi.BASE) + "/") + (com.dataloom.data.DataApi.ENTITY_DATA)) + "/") + (com.dataloom.data.DataApi.SET_ID_PATH))
java.lang.Iterable<com.google.common.collect.SetMultimap<org.apache.olingo.commons.api.edm.FullQualifiedName, java.lang.Object>> loadEntitySetData(@retrofit2.http.Path(value = com.dataloom.data.DataApi.SET_ID)
java.util.UUID entitySetId, @retrofit2.http.Query(value = com.dataloom.data.DataApi.FILE_TYPE)
com.dataloom.data.DataApi.FileType fileType);