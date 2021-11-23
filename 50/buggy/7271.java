@java.lang.Override
public void onNewInput(java.lang.String input) {
    trigger.exec(input, mTerminalAdapter.getCurrentOutputId());
    suggestionsView.removeAllViews();
}