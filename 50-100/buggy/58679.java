private void addSingleMappings(int cidBegin, org.verapdf.cos.COSArray arr) {
    for (int i = 0; i < (arr.size()); i++) {
        if (arr.at(i).getType().isNumber()) {
            org.verapdf.pd.font.CIDWArray.LOGGER.debug("W array in CIDFont has invalid entry.");
            continue;
        }
        this.singleMappings.put((cidBegin + i), arr.at(i).getReal());
    }
}