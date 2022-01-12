@java.lang.Override
public void executeInsert(java.lang.String dataSet, java.lang.String queryString) {
    org.apache.jena.update.UpdateAction.parseExecute(queryString, dataset);
}