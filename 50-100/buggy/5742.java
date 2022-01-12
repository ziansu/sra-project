@org.warheim.interfacing.jiffy32.Test
public void testMetadata() throws java.lang.Exception {
    java.lang.System.err.println(jiffy.getChipInfo().toString());
    java.lang.System.err.println(jiffy.getAddress().toString());
    java.lang.System.err.println(jiffy.getProduct());
    java.lang.System.err.println(jiffy.getSerialNumber());
    jiffy.setSerialNumber("serial12345");
    java.lang.System.err.println(jiffy.getSerialNumber());
    java.lang.System.err.println(jiffy.getVendor());
}