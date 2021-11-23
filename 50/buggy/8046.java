boolean isTerminal(int symbolIndex) {
    return (symbolIndex == (end)) || (terminalIndexes.contains(symbolIndex));
}