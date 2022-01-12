@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent;
    intent = new android.content.Intent();
    android.widget.Toast.makeText(this, "Intent Created", Toast.LENGTH_SHORT).show();
    intent.putExtra("fileName", selectedFilePath);
    android.widget.Toast.makeText(this, "DIS EXTRA SUFF S+DIEN", Toast.LENGTH_SHORT).show();
    intent.putExtra("shortFileName", selectedFileName);
    setResult(2, intent);
    this.finish();
}