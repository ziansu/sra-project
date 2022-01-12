@java.lang.Override
public void onClick(android.view.View view) {
    try {
        java.lang.String text = heightEditText.getText().toString().trim();
        kugelmatikManager.setHeight(java.lang.Integer.parseInt(text));
    } catch (java.lang.Exception e) {
        showError();
        e.printStackTrace();
    }
}