public void actionPerformed(java.awt.event.ActionEvent e) {
    if ((display.getState()) != (EntryState.MID_CALC))
        display.submitToTopDisplay(((display.getEntryDisplayText()) + " "));
    
    if (!(display.getTopDisplayText().trim().isEmpty()))
        display.setMidCalc(solve(display.getTopDisplayText()));
    
    display.submitToTopDisplay((" " + (e.getActionCommand())));
}