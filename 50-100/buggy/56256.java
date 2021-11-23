private void mapString(final de.dpa.oss.metadata.mapper.imaging.configuration.generated.IIMMapping.MapsTo mappingInfo, final java.lang.String value, final de.dpa.oss.metadata.mapper.imaging.common.ImageMetadata metadata) {
    if ((iimStringCharacterMapping) != null) {
        metadata.addIPTCEntry(mappingInfo.getField(), value);
    }else {
        metadata.addIPTCEntry(mappingInfo.getField(), iimStringCharacterMapping.map(value));
    }
}