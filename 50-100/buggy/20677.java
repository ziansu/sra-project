@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent arg0) {
    game.enqueuePrompt(DisplayPrompt.TILE_PROMPT);
    eq.createPendingEvent(0, MacroOperation.NO_OP);
    grid.setFocusedTile(grid.getXOfCombatant(0), grid.getYOfCombatant(0));
    display.DisplayKeyBindings.updateSourceDescPair(game.peekPrompt(), grid, p1, mm);
    display.DisplayKeyBindings.updateOutput(grid, p1, eq);
    game.repaint();
}