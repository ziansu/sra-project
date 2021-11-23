boolean calculateDeltaTime(java.util.Date startField, java.util.Date stopField, java.util.concurrent.TimeUnit minutes) {
    long deltaInMilli = (stopField.getTime()) - (startField.getTime());
    long deltaInMin = (minutes.convert(deltaInMilli, java.util.concurrent.TimeUnit.MILLISECONDS)) - (java.lang.Integer.parseInt(interruptField.getText()));
    if (deltaInMin < 0) {
        deltaField.setText("Invalid Time Frame");
    }else {
        deltaField.setText(java.lang.Long.toString(deltaInMin));
    }
    return true;
}