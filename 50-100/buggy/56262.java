@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    propCalc();
    repaint();
    try {
        for (int n = 0; n < (step); n++) {
            outFile.println(getFactor());
        }
        operator();
    } catch (java.io.FileNotFoundException e1) {
        e1.printStackTrace();
    }
    (counter)++;
}