public void markPhaseTable2() {
    java.lang.String command = forall.HelpA.getValueSelectedRow(mCRecipe.jTableSequnece1, "Command Name");
    if (command == null) {
        return ;
    }
    if (command.equals("ADD PHASE")) {
        int phase = ((int) (java.lang.Double.parseDouble(forall.HelpA.getValueSelectedRow(mCRecipe.jTableSequnece1, "Cmd Parameter"))));
        java.util.LinkedList<java.lang.Integer> list = getRowsWithGivenPhase(phase, mCRecipe.jTableSequnce2);
        paint_selected_rows_a(list, mCRecipe.jTableSequnce2, java.awt.Color.LIGHT_GRAY);
    }else {
        unpaintAllRows_a(mCRecipe.jTableSequnce2);
    }
}