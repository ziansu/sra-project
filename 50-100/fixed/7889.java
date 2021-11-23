@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    android.content.Intent intent;
    switch (position) {
        case 0 :
            intent = new android.content.Intent(this, com.coolbitx.coolwallet.ui.ExchangeRateActivity.class);
            startActivity(intent);
            break;
        case 1 :
            intent = new android.content.Intent(this, com.coolbitx.coolwallet.ui.TransactionFeeActivity.class);
            startActivity(intent);
            break;
    }
}