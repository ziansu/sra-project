public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.ma_openurl :
            presenter.openUrlClicked(((java.lang.String) (obtainedTextView.getText())));
            break;
        case R.id.toolbar_button :
            presenter.toolbarButtonClicked(ua.frg.qr.utils.Settings.getFPrefix(context), ua.frg.qr.utils.Settings.getFSufix(context), ua.frg.qr.utils.Settings.getBPrefix(context), ua.frg.qr.utils.Settings.getBSufix(context));
            break;
    }
}