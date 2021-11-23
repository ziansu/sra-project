public static void log(java.lang.String msg) {
    guiLogger.Gui.jtextarea.setText((((((((guiLogger.Gui.jtextarea.getText()) + "[") + (guiLogger.Gui.df.format(new java.util.Date()))) + "] ") + (guiLogger.Gui.jlabel.getText())) + msg) + "\n"));
    guiLogger.Gui.jtextarea.setCaretPosition(guiLogger.Gui.jtextarea.getText().length());
}