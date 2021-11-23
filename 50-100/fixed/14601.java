@java.lang.Override
public void onRewardedVideoAdClosed() {
    if (!(resourcePackF.exists())) {
        installResourcePack(R.string.alertdialog_message_exception_successful);
    }
    android.widget.Button btn = ((android.widget.Button) (findViewById(R.id.btn_download)));
    btn.setEnabled(false);
    ((android.widget.TextView) (findViewById(R.id.btn_download))).setText(R.string.button_text_loading);
    loadRewardedVideoAd();
}