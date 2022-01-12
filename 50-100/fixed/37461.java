public static void log(java.lang.String msg) {
    guiLogger.Gui.jtextarea.setText((((((((guiLogger.Gui.jlabel.getText()) + (guiLogger.Gui.jtextarea.getText())) + "[") + (guiLogger.Gui.df.format(new java.util.Date()))) + "] ") + msg) + "\n"));
    guiLogger.Gui.jtextarea.setCaretPosition(guiLogger.Gui.jtextarea.getText().length());
}