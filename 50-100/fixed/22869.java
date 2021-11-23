public void SetLevel(int lvl, int iChannel) {
    javax.swing.JProgressBar targetGUI;
    switch (iChannel) {
        case 0 :
            targetGUI = fMeterL;
            break;
        case 1 :
            targetGUI = fMeterR;
            break;
        default :
            targetGUI = fMeterL;
    }
    targetGUI.setValue(lvl);
}