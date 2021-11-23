@java.lang.Override
public int complete(org.jboss.as.cli.CommandContext ctx, java.lang.String buffer, int cursor, java.util.List<java.lang.String> candidates) {
    org.aesh.complete.AeshCompleteOperation co = new org.aesh.complete.AeshCompleteOperation(aeshCommands.getAeshContext(), buffer, cursor);
    complete(co);
    for (org.aesh.terminal.formatting.TerminalString ts : co.getCompletionCandidates()) {
        candidates.add(ts.getCharacters());
    }
    return co.getOffset();
}