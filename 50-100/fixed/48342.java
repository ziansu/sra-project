public void handleEvent(org.eclipse.swt.widgets.Event e) {
    if ((e.type) == (org.eclipse.swt.SWT.Selection)) {
        job.compute(TRACE_ID, resolutionSlider.getSelection(), transparencySlider.getSelection(), getSlicingSystem().getData().getLazySet());
    }
}