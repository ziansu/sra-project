private void parseQuantizationDefault() throws org.codice.imaging.jpeg2000.JP2ParsingException {
    int markerLength = mReader.readUnsignedShort();
    int quantizationStyleForAllComponents = mReader.readUnsignedByte();
    mReader.skipBytes((markerLength - 3));
    mRemainingCodestreamLength -= markerLength - 2;
}