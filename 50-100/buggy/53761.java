public java.lang.String getUserInput() {
    synchronized(Task.Gui.class) {
        java.lang.String userInput = "";
        try {
            Task.Gui.class.wait();
            Task.Gui.getCurrentInstance();
            userInput = Task.Gui.tb.getText();
            Task.Gui.tb.setText("");
        } catch (java.lang.InterruptedException e) {
            return "";
        }
        return userInput;
    }
}