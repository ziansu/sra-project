@java.lang.Override
public void run() {
    mprView.setProgressBar(null);
    org.weasis.dicom.codec.utils.DicomMediaUtils.writeMetaData(dicomSeries, attributes);
    mprView.setSeries(dicomSeries);
    for (java.lang.String action : MPRContainer.DEFAULT_MPR.getSynchData().getActions().keySet()) {
        mprView.setActionsInView(action, view.getActionValue(action));
    }
    mprView.zoom(mainView.getViewModel().getViewScale());
    mprView.center();
    mprView.repaint();
}