@java.lang.Override
public net.openchrom.msd.converter.supplier.cms.model.IIonMeasurement getIonMeasurement(int scanIndex) {
    if (!(isMinMaxSignalCalculated())) {
        updateSignalLimits();
    }
    if ((scanIndex >= 0) && (scanIndex < (ionMeasurements.size()))) {
        return ionMeasurements.get(scanIndex);
    }else {
        return null;
    }
}