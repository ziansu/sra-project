@java.lang.Override
public void onClick(android.view.View v) {
    ((android.widget.Button) (findViewById(R.id.start))).setText("Restart");
    hideAllStatusViews();
    statuses[0].progress.setVisibility(View.VISIBLE);
    com.everypay.sdk.views.CardFormActivity.startForResult(this);
}