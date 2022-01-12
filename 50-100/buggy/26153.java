@java.lang.Override
public void onClick(android.view.View view) {
    switch (view.getId()) {
        case R.id.activity_product_barcode_button :
            android.content.Intent intent = new android.content.Intent(this, com.example.rayloo.diodebuilder.BarcodeActivity.class);
            intent.putExtra(BarcodeActivity.AutoFocus, autoFocus.isChecked());
            startActivityForResult(intent, com.example.rayloo.diodebuilder.ProductActivity.RC_BARCODE_CAPTURE);
            break;
    }
}