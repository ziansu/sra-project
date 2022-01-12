@java.lang.Override
public void setValue(double aVal) {
    super.setValue(aVal);
    if (null != (iSeries)) {
        final java.lang.Double newY = com.ivli.roim.controls.XYSeriesUtilities.getNearestY(aVal, iSeries);
        if (null != (iLink)) {
            iLink.setValue(newY);
            iLink.setLabel(java.lang.String.format(com.ivli.roim.controls.DomainMarker.LABEL_FORMAT, newY));
        }
        setLabel(java.lang.String.format(com.ivli.roim.controls.DomainMarker.LABEL_FORMAT, aVal));
    }else {
        setLabel(java.lang.String.format("%f", aVal));
    }
}