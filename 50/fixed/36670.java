@java.lang.Override
public void intervalTooBig(java.util.Date requestedStartTime, java.util.Date requestedEndTime) {
    downloadRequestData = new org.helioviewer.jhv.plugins.eveplugin.radio.data.DownloadRequestData();
    lineDataSelectorModel.addLineData(downloadRequestData);
    fireIntervalTooBig();
    fireNewDataAvailable(downloadRequestData);
    fireDownloadRequestAnswered(new org.helioviewer.jhv.base.interval.Interval<java.util.Date>(requestedStartTime, requestedEndTime));
}