public void deleteAll() {
    try {
        com.edp.myesper.engine.EsperEngine.logger.info("Trying to delete all queries from the Esper Engine Server.");
        deleteQueryDB("ALL");
        java.util.List<java.lang.Integer> keyset = new java.util.ArrayList<java.lang.Integer>(queryMap.keySet());
        for (int i : keyset) {
            queryMap.get(i).destroyQuery();
            queryMap.remove(i);
        }
        com.edp.myesper.engine.EsperEngine.logger.info("All queries have been deleted from the Esper Engine Server.");
        countQueryRunning = 0;
    } catch (java.lang.Exception e) {
        com.edp.myesper.engine.EsperEngine.logger.error("Something went wrong while trying to delete all queries.", e);
    }
}