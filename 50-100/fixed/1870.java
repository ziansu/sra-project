private void checkIfThereIsMatchIn(io.bdrc.lucene.stemmer.Row row, int c) {
    cmdIndex = row.getCmd(((char) (c)));
    foundMatch = (cmdIndex) >= 0;
    if (foundMatch) {
        foundMatchCmdIndex = cmdIndex;
        foundNonMaxMatch = storeNonMaxMatchState();
    }
}