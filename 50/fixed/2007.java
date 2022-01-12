@java.lang.Override
public void beginNonTerminalVisit(java.lang.String nonTerminalText) {
    if (nonTerminalText.equals("class")) {
        inClassNonTerminal = true;
    }
}