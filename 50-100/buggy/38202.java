private void jtxt_convergenceThresholdActionPerformed() {
    double convThreshold;
    try {
        convThreshold = java.lang.Double.parseDouble(jtxt_convergenceThreshold.getText());
        if ((convThreshold < 0) || (convThreshold > 100))
            convThreshold = ELoopHandlingProps.CONVERGENCE_THRESHOLD_DEFAULT;
        
    } catch (java.lang.NumberFormatException e) {
        convThreshold = ELoopHandlingProps.CONVERGENCE_THRESHOLD_DEFAULT;
    }
    jtxt_convergenceThreshold.setText((convThreshold + ""));
}