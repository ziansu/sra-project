@java.lang.SuppressWarnings(value = "unchecked")
public static <T> T getFeatureResult(java.lang.String result, java.lang.String feature) throws java.lang.IllegalAccessException, java.lang.InstantiationException {
    com.first.wuapi.domain.Parsable element = null;
    java.lang.Class<? extends com.first.wuapi.domain.WUElement> clazz = com.first.wuapi.domain.Feature.valueOf(feature.toUpperCase()).getClazz();
    element = clazz.newInstance();
    element.setResult(result);
    try {
        element = element.parse();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return ((T) (element));
}