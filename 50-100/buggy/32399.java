public void updateTimeGroup(java.lang.String output) {
    if ((c.getEventType()) != 0) {
        txtRun.setText("");
        txtRun.append(output);
    }else {
        txtRun.setText("");
        runTimeGroup.interrupt();
        runTimeGroup = null;
    }
}