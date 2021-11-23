public void run() {
    org.dawb.workbench.plotting.Activator.getDefault().getPreferenceStore().setValue(PlottingConstants.PLOT_X_DATASET, false);
    setChecked(true);
    xfirst = false;
    fireTracesAltered(new org.dawb.common.ui.plot.trace.TraceEvent(xyGraph));
}