@java.lang.Override
public void executeInsert(java.lang.String dataSet, java.lang.String queryString) {
    mk.ukim.finki.univds.service.impl.Dataset dataset = loadDataset(dataSet);
    org.apache.jena.update.UpdateAction.parseExecute(queryString, dataset);
    dataset.close();
}