private void bindToCoordinates(com.task.vasskob.firebase.model.Coordinates coordinates) {
    java.lang.String formattedTime = new java.text.SimpleDateFormat("MM/dd/yyyy_HH:mm:ss", java.util.Locale.US).format(coordinates.recordTime);
    recordingTime.setText(formattedTime);
    accelerometerData.setText((((((("(" + (coordinates.coordinateX)) + ",") + (coordinates.coordinateY)) + ",") + (coordinates.coordinateZ)) + ")"));
}