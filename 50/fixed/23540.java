private static void processComplete(java.lang.String input) throws java.io.IOException, java.lang.NullPointerException {
    java.lang.System.out.println("is valid complete");
    ui.list.swing.PrintHandler.printPage(ui.list.swing.PageHandler.getPageOfIndex(((UserInterface.completeIndex) - 1)));
    ui.list.swing.UiLogic.executeAndUpdate(input);
    UserInterface.completeIndex = -1;
}