@java.lang.Override
public void onClick(android.view.View v) {
    android.widget.EditText sessionIdText = ((android.widget.EditText) (findViewById(R.id.sessionId)));
    java.lang.String sessionId = sessionIdText.getText().toString();
    if (!(sessionId.isEmpty())) {
        android.content.Intent intent = new android.content.Intent(getApplicationContext(), org.wso2.carbon.iot.android.sense.speech.detector.WordRecognitionActivity.class);
        intent.putExtra("sessionId", sessionId);
        startActivity(intent);
    }else {
        android.widget.Toast.makeText(this, "Please type a session id value", Toast.LENGTH_SHORT).show();
    }
}