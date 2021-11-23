private void jButton_StartActionPerformed(java.awt.event.ActionEvent evt) {
    int status;
    if ((aggregator.running_flag) == false) {
        int_counter = ((java.lang.Number) (jSpinnerInterval.getValue())).intValue();
        if ((int_counter) > 0) {
            status = aggregator.Start();
            if (status == 0) {
                jButton_Start.setText("Stop");
                jSpinnerInterval.setEnabled(false);
            }
        }
    }else {
        resetAggregatorState();
    }
}