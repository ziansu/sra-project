public void actionPerformed(java.awt.event.ActionEvent e) {
    if ((performMLECombo.getSelectedIndex()) == 1) {
        mleOptions.performMLE = true;
        buttonMLE.setEnabled(true);
        updateMLEFileNameStem();
    }else
        if ((performMLECombo.getSelectedIndex()) == 2) {
            mleOptions.performMLEGSS = true;
            options.logCoalescentEventsStatistic = true;
            buttonMLE.setEnabled(true);
            updateMLEFileNameStem();
        }else {
            mleOptions.performMLE = false;
            mleOptions.printOperatorAnalysis = false;
            options.logCoalescentEventsStatistic = false;
            buttonMLE.setEnabled(false);
        }
    
}