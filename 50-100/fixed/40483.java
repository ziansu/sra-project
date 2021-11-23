@java.lang.Override
protected void onPostExecute(com.brand.ushopping.model.ManJainVoucher result) {
    if (result != null) {
        if (result.isSuccess()) {
            manJianVoucherItemResults = result.getManJianVoucherItems();
            voucherReload();
            calculateSummary();
        }else {
            android.widget.Toast.makeText(this, result.getMsg(), Toast.LENGTH_SHORT).show();
        }
    }
}