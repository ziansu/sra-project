public void submitInfo(android.view.View view) {
    java.lang.Boolean isValid = checkValidity();
    hideKeyboard();
    if (isValid) {
        android.widget.Toast submitToast = android.widget.Toast.makeText(getApplicationContext(), "Successfully submitted!", Toast.LENGTH_SHORT);
        submitToast.show();
        android.content.Intent intent = new android.content.Intent(view.getContext(), com.example.seetharaman.trial.MainActivity.class);
        startActivity(intent);
    }else {
        android.widget.Toast submitToast = android.widget.Toast.makeText(getApplicationContext(), "Please provide valid details", Toast.LENGTH_SHORT);
        submitToast.show();
    }
}