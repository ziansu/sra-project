@java.lang.Override
public void beginNonTerminalVisit(java.lang.String nonTerminalText) {
    inClassNonTerminal = nonTerminalText.equals("class");
}