private void writeData(org.n52.io.response.dataset.DataCollection<org.n52.io.response.dataset.measurement.MeasurementData> data, java.io.OutputStream stream) throws java.io.IOException {
    for (org.n52.io.response.dataset.DatasetOutput metadata : seriesMetadatas) {
        org.n52.io.response.dataset.measurement.MeasurementData series = data.getSeries(metadata.getId());
        writeData(metadata, ((org.n52.io.response.dataset.measurement.MeasurementData) (series)), stream);
    }
}