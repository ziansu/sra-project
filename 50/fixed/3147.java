@java.lang.Override
public void onClick(android.view.View v) {
    if (datacare.ekvoice.MainActivity.isInternetConnected(getApplicationContext())) {
        promptOnlineSpeechInput();
    }else {
        android.widget.Toast.makeText(getApplicationContext(), "No Internet", Toast.LENGTH_SHORT).show();
    }
}