public void SetLevel(int lvl, int iChannel) {
    java.lang.String s;
    javax.swing.JProgressBar targetGUI;
    javax.swing.JLabel targetTxt;
    switch (iChannel) {
        case 0 :
            targetGUI = fMeterL;
            targetTxt = fSigClipL;
            break;
        case 1 :
            targetGUI = fMeterR;
            targetTxt = fSigClipR;
            break;
        default :
            targetGUI = fMeterL;
            targetTxt = fSigClipL;
    }
    s = "" + lvl;
    targetGUI.setValue(lvl);
    targetTxt.setText(s);
}