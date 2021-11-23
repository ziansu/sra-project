@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.btnAddProduct :
            intent = new android.content.Intent(this, org.itstep.pps2701.blokhin.androidshopproject.ProductDialog.class);
            intent.putExtra("request", REQUEST_PRODUCT);
            startActivityForResult(intent, REQUEST_PRODUCT);
            break;
        case R.id.btnBack :
            finish();
            break;
    }
}