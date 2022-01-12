public static void main(java.lang.String[] args) {
    org.apromore.service.logvisualizer.impl.LogVisualizerServiceImpl l = new org.apromore.service.logvisualizer.impl.LogVisualizerServiceImpl();
    org.deckfour.xes.model.XLog log = null;
    try {
        log = au.edu.qut.util.ImportEventLog.importFromFile(new org.deckfour.xes.factory.XFactoryNaiveImpl(), "/Volumes/Data/IdeaProjects/Models/Zip/Logs/BPI Challenge - 2012.xes.gz");
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    java.lang.String s = l.visualizeLog(log, 0.5, 1);
    java.lang.System.out.println();
}