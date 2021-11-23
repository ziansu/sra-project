public void updateProgressBarsForCurrentFolderResults(int recognised, int notRecognised, int notFound) {
    int sum = (recognised + notRecognised) + notFound;
    setResultToNorthPanel(recognised, notRecognised, notFound);
    recognisedProgressBar.setMaximum(sum);
    notRecognisedProgressBar.setMaximum(sum);
    notFoundProgressBar.setMaximum(sum);
    recognisedProgressBar.setValue(recognised);
    notRecognisedProgressBar.setValue(notRecognised);
    notFoundProgressBar.setValue(notFound);
}