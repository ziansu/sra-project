@java.lang.Override
public void prepare(@java.lang.SuppressWarnings(value = "rawtypes")
java.util.Map conf, org.apache.storm.task.TopologyContext context, org.apache.storm.task.OutputCollector collector) {
    try {
        _collector = collector;
        com.cybozu.labs.langdetect.DetectorFactory.loadProfile(conf.get("lang_profiles").toString());
        com.cybozu.labs.langdetect.DetectorFactory.setSeed(0);
        limit = java.lang.Double.parseDouble(conf.get("limit").toString());
    } catch (com.cybozu.labs.langdetect.LangDetectException e) {
        org.luismesalas.storm.bolt.LangIdentifier.logger.severe(("Error on inicialization on LangIdentifier bolt: " + (e.getMessage())));
        e.printStackTrace();
    }
}