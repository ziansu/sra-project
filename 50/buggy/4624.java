@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    android.content.Intent intent = new android.content.Intent();
    intent.putExtra("data_return", word);
    setResult(com.example.a99460.smartnote.RESULT_OK, intent);
    finish();
}