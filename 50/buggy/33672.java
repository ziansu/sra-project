@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    try {
        prepearings.Symbol chosed = new prepearings.Symbol(browsfield.getText());
        chosed.parseAll();
        chosed.printAll();
    } catch (java.io.IOException e1) {
        e1.printStackTrace();
    }
}