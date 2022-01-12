@java.lang.Override
public org.n52.series.db.beans.MeasurementDataEntity getFirstValue() {
    final org.n52.series.db.beans.MeasurementDataEntity firstValue = super.getFirstValue();
    if (firstValue != null) {
        java.util.Date when = firstValue.getTimestamp();
        java.lang.Double value = firstValue.getValue();
        if ((when == null) || (value == null)) {
            return null;
        }
    }
    return firstValue;
}