@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    try {
        doppeler9k.FunctionGenerator gen = new doppeler9k.FunctionGenerator(((float) (java.lang.Math.log(java.lang.Float.parseFloat(souPanel.freqField.getText())))), 10, functionChoice);
    } catch (java.lang.NumberFormatException | javax.sound.sampled.LineUnavailableException | java.io.IOException e1) {
        e1.printStackTrace();
    }
}