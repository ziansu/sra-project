private boolean save() {
    boolean valid = true;
    if ((schedule.getReceiver()) == null) {
        groupReceiver.setBackgroundResource(R.color.red25percent);
        valid = false;
    }
    if ((txtSendIntervalMin.getText().length()) == 0) {
        groupInterval.setBackgroundResource(R.color.red25percent);
        valid = false;
    }
    if (valid) {
        if ((editing) && (changed))
            transmissionTab.saveEdited(schedule);
        else
            transmissionTab.addNew(schedule);
        
    }
    return valid;
}