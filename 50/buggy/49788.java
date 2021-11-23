@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    if (!(testRun)) {
        startTest();
        btnStart.setText("Stop");
    }else {
        endTest();
        btnStart.setText("Start");
    }
    testRun = !(testRun);
}