@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    if (On()) {
        java.lang.String print = "";
        try {
            print = t.PRINT(java.lang.Integer.parseInt(textFromButtons.getText()));
        } catch (java.lang.Exception e1) {
            e1.printStackTrace();
        }
        if (print != null) {
            updateScreen((("PRINT" + "\n") + print));
        }else {
            updateScreen("PRINT Failed");
        }
    }
}