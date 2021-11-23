protected uk.ac.ucl.excites.sapelli.transmission.model.Transmission<?> retrieveTransmissionByQuery(uk.ac.ucl.excites.sapelli.storage.queries.RecordsQuery multiRecordQuery) throws java.lang.IllegalStateException {
    java.util.List<uk.ac.ucl.excites.sapelli.transmission.model.Transmission<?>> results = retrieveTransmissions(multiRecordQuery);
    if ((results.size()) > 0)
        throw new java.lang.IllegalStateException("Found more than 1 matching transmission for query");
    
    if (results.isEmpty())
        return null;
    else
        return results.get(0);
    
}