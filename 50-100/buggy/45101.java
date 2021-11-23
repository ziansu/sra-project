private void calculateAndSaveMap(java.io.File file, dialogs.ProgressBarDialog pBar) {
    loadParameters();
    final java.lang.Iterable<utils.SVGMap.Path> transformed = map(input, 1, aspect.clone(), pBar::setProgress);
    try {
        input.save(transformed, file, pBar::setProgress);
    } catch (java.io.IOException e) {
        showError("Failure!", (("Could not access " + (file.getAbsolutePath())) + ". It's possible that another program has it open."));
    }
}