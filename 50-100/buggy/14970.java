public void highlightField(android.view.View view) {
    com.example.murk.kwizgeeq.view.EditText textField = ((com.example.murk.kwizgeeq.view.EditText) (view));
    if (textField.equals(correctText)) {
        int greenColor = android.graphics.Color.argb(255, 150, 255, 150);
        correctText.setBackgroundColor(greenColor);
    }else {
        int redColor = android.graphics.Color.argb(255, 255, 129, 109);
        correctText.setBackgroundColor(redColor);
    }
}