@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    if ((com.robertobubalo.Main.currentInput.indexOf("-")) >= 0) {
        if (com.robertobubalo.Main.currentInput.equals("0")) {
        }else {
            com.robertobubalo.Main.currentInput = com.robertobubalo.Main.currentInput.replace("-", "");
            com.robertobubalo.Main.a.setText(com.robertobubalo.Main.currentInput);
        }
    }else {
        if (com.robertobubalo.Main.currentInput.equals("0")) {
        }else {
            com.robertobubalo.Main.currentInput = "-" + (com.robertobubalo.Main.currentInput);
            com.robertobubalo.Main.a.setText(com.robertobubalo.Main.currentInput);
        }
    }
    com.robertobubalo.Main.gui.grabFocus();
}