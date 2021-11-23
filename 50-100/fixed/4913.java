@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent result = new android.content.Intent();
    result.putExtra(com.ivanchug.moneytracker.AddActivity.RESULT_ITEM, new com.ivanchug.moneytracker.api.Item(name.getText().toString(), java.lang.Integer.valueOf(amount.getText().toString()), type, this));
    setResult(com.ivanchug.moneytracker.RESULT_OK, result);
    finish();
}