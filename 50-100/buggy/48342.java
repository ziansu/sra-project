public void handleEvent(org.eclipse.swt.widgets.Event e) {
    if ((e.type) == (org.eclipse.swt.SWT.Selection)) {
        java.lang.System.out.println(transparencySlider.getSelection());
        java.lang.System.out.println(resolutionSlider.getSelection());
        job.compute(TRACE_ID, transparencySlider.getSelection(), resolutionSlider.getSelection(), getSlicingSystem().getData().getLazySet());
    }
}