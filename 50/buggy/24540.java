@org.junit.Test
public void getKettleHomeProperty_explicitly_set() {
    final java.lang.String KETTLE_HOME = "/my/kettle";
    final org.apache.hadoop.conf.Configuration c = new org.apache.hadoop.conf.Configuration();
    c.set(MRUtil.PROPERTY_PENTAHO_KETTLE_HOME, KETTLE_HOME);
    java.lang.String kettleHome = org.pentaho.hadoop.mapreduce.MRUtil.getKettleHomeProperty(c);
    org.junit.Assert.assertEquals(KETTLE_HOME, kettleHome);
}