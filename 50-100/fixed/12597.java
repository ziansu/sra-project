@org.junit.Test
public void getPluginDirProperty_explicitly_set() throws org.pentaho.di.core.exception.KettleException {
    final java.lang.String PLUGIN_DIR = "/opt/pentaho";
    c.set(MRUtil.PROPERTY_PENTAHO_KETTLE_PLUGINS_DIR, PLUGIN_DIR);
    java.lang.String pluginDirProperty = org.pentaho.hadoop.mapreduce.MRUtil.getPluginDirProperty(c);
    org.junit.Assert.assertTrue(("Plugin Directory Property not configured as expected: " + pluginDirProperty), pluginDirProperty.endsWith(PLUGIN_DIR));
}