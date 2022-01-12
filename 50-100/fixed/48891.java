public void run() {
    org.apache.jena.util.iterator.ClosableIterator<org.apache.jena.rdf.model.Model> modelIter = source.modelIterator();
    try {
        while (modelIter.hasNext()) {
            if (!(sink.insert(modelIter.next(), cfg.getString(org.xenei.galway2020.processor.Processor.GRAPH_NAME)))) {
                org.xenei.galway2020.processor.Processor.LOG.error("Could not update data");
            }
        } 
    } catch (java.io.IOException e) {
        org.xenei.galway2020.processor.Processor.LOG.error(e.getMessage(), e);
    } finally {
        modelIter.close();
    }
}