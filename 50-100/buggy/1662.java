private void jButton_StartActionPerformed(java.awt.event.ActionEvent evt) {
    int status;
    if ((aggregator.running_flag) == false) {
        status = aggregator.Start();
        if (status == 0) {
            jButton_Start.setText("Stop");
            jSpinnerInterval.setEnabled(false);
            int_counter = ((java.lang.Number) (jSpinnerInterval.getValue()));
        }
    }else {
        resetAggregatorState();
    }
}