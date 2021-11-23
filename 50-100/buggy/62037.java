@java.lang.Override
public void onClick(android.view.View v) {
    final java.lang.String tags = tagsField.getText().toString();
    if ((fileName) != null) {
        android.widget.Toast.makeText(this, "No recording available!", Toast.LENGTH_SHORT).show();
    }else {
        new com.rutgerssustainability.android.rutgerssustainability.aws.AmazonService(this, fileName, tags, dataSource, deviceId, lastLocation, avgDecibel).execute();
    }
}