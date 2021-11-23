@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent;
    intent = new android.content.Intent();
    intent.putExtra("fileName", selectedFilePath);
    intent.putExtra("shortFileName", selectedFileName);
    setResult(2, intent);
    this.finish();
}