public static final void addResults(java.lang.Class clazz, java.io.Serializable result) {
    if (project.tddd80.keval992.liu.ida.se.navigationbase.main.ResultsReceiver.results.containsKey(clazz)) {
        project.tddd80.keval992.liu.ida.se.navigationbase.main.ResultsReceiver.results.put(clazz, new java.util.LinkedList<java.io.Serializable>());
    }
    project.tddd80.keval992.liu.ida.se.navigationbase.main.ResultsReceiver.results.get(clazz).add(result);
}