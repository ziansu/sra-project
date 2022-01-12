public void run() {
    org.dawb.workbench.plotting.Activator.getDefault().getPreferenceStore().setValue(PlottingConstants.PLOT_X_DATASET, true);
    setChecked(true);
    xfirst = true;
    fireTracesAltered(new org.dawb.common.ui.plot.trace.TraceEvent(xyGraph));
}