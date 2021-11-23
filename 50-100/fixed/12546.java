public void rerunFilter() {
    filterOutput.clear();
    ninja.mbedded.ninjaterm.util.streamedText.StreamedText toBeConsumed = new ninja.mbedded.ninjaterm.util.streamedText.StreamedText(totalUnfrozenAnsiParserOutput);
    bufferBetweenAnsiParserAndFilter = toBeConsumed;
    streamingFilter.parse(toBeConsumed, filterOutput);
    for (ninja.mbedded.ninjaterm.model.terminal.txRx.StreamedTextListener newStreamedTextListener : newStreamedTextListeners) {
        newStreamedTextListener.run(filterOutput);
    }
    filterOutput.clear();
}