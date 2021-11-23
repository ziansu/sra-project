public static java.util.List<java.lang.String> getSupportedEncodings() {
    if ((org.omegat.filters2.master.FilterMaster.supportedEncodings) == null) {
        org.omegat.filters2.master.FilterMaster.supportedEncodings = new java.util.ArrayList<java.lang.String>();
        org.omegat.filters2.master.FilterMaster.supportedEncodings.add(AbstractFilter.ENCODING_AUTO_HUMAN);
        org.omegat.filters2.master.FilterMaster.supportedEncodings.addAll(java.nio.charset.Charset.availableCharsets().keySet());
    }
    return org.omegat.filters2.master.FilterMaster.supportedEncodings;
}