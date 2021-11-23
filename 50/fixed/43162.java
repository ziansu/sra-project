public static java.lang.String lookupCipherFileSuffixClient() {
    return mfi.filejuggler.maps.KVMemoryMap.getInstance().readValueFromKey("application.properties.cipherFileSuffixClient");
}