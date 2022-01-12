@java.lang.Override
public void onClick(android.view.View v) {
    java.lang.String wordsToTranslate = mEditText.getText().toString();
    if (!(android.text.TextUtils.isEmpty(wordsToTranslate))) {
        android.widget.Toast.makeText(this, "Getting Translations", Toast.LENGTH_LONG).show();
        new com.star.translation.MainActivity.GetXmlData().execute();
    }else {
        android.widget.Toast.makeText(this, "Enter Words to Translate", Toast.LENGTH_LONG).show();
    }
}