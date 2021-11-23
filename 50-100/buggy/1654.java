public static void main(java.lang.String[] args) throws java.sql.SQLException {
    new view.mode.dialog.help.QuestionAnswerDialog().setVisible(true);
    new org.languagetool.gui.GrammarChecker(new javax.swing.JTextArea());
    view.MainFrame mainFrame = new view.MainFrame();
    mainFrame.getChooseModePanel().setMainFrame(mainFrame);
    mainFrame.getChooseFriendPanel().setMainFrame(mainFrame);
    mainFrame.getMainMenuPanel().setMainFrame(mainFrame);
    mainFrame.getViewStoryPanel().setMainFrame(mainFrame);
    mainFrame.setVisible(true);
}