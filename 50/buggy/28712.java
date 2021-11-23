@org.apache.felix.scr.annotations.Activate
public void activate(@java.lang.SuppressWarnings(value = "rawtypes")
final java.util.Map properties) throws java.lang.Exception {
    this.configurationPath = org.apache.sling.commons.osgi.PropertiesUtil.toString(properties.get(biz.netcentric.cq.tools.actool.aceservice.impl.AceServiceImpl.PROPERTY_CONFIGURATION_PATH), "");
}