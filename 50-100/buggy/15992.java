public void onBackPressed() {
    cancelToast();
    if ((keyboard.getVisibility()) == (android.view.View.VISIBLE)) {
        keyboard.startAnimation(exitAnim);
        keyboard.setVisibility(View.GONE);
    }else {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("totalMoney", btnMoney.getText());
        setResult(com.swjtu.huxin.accountmanagement.activity.RESULT_OK, intent);
        finish();
    }
}