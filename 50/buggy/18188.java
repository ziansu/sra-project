public java.util.List<org.openhab.binding.zwave.internal.config.ZWaveDbProduct> GetProducts() {
    if ((selManufacturer) == null) {
        return java.util.Collections.emptyList();
    }
    return selManufacturer.Product;
}