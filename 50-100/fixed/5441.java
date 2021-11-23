private java.io.File getFile(java.lang.String datasetName) {
    java.lang.StringBuilder builder = new java.lang.StringBuilder();
    builder.append(configuration.getString(no.imr.nmdapi.dao.file.NMDSeriesReferenceDaoImpl.PRE_DATA_DIR)).append(java.io.File.separator);
    builder.append(datasetName).append(java.io.File.separator);
    builder.append(no.imr.nmdapi.dao.file.NMDSeriesReferenceDaoImpl.DATASET_FILENAME);
    return new java.io.File(builder.toString());
}