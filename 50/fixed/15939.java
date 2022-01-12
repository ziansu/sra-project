@java.lang.Override
public void peaksChanged(org.dawnsci.plotting.tools.finding.PeakOpportunityEvent evt) {
    peaks = evt.getPeaks();
}