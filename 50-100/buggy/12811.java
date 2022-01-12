private void addEntry(int answer) {
    entries.add(new Entry(allTrials.get(((counter) - 1)), answer, (((inCircleSteps) * 1.0) / (totalTimeSteps)), ((java.lang.System.currentTimeMillis()) - (startTime)), counter, currentGazeDataSet, new Tuple(this.getGCanvas().getLocationOnScreen()), ((inPracticeMode) && ((counter) < 5))));
}