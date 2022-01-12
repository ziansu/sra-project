public static java.util.List<java.lang.String> getSupportedEncodings() {
    if ((org.omegat.filters2.master.FilterMaster.supportedEncodings) == null) {
        java.util.ArrayList<java.lang.String> list = new java.util.ArrayList<java.lang.String>();
        list.add(AbstractFilter.ENCODING_AUTO_HUMAN);
        list.addAll(java.nio.charset.Charset.availableCharsets().keySet());
        org.omegat.filters2.master.FilterMaster.supportedEncodings = list;
    }
    return org.omegat.filters2.master.FilterMaster.supportedEncodings;
}