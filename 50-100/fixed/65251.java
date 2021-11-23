@java.lang.Override
public void onClick(com.changhong.tvhelper.activity.View v) {
    MyApplication.vibrator.vibrate(100);
    searchString = searchEditText.getText().toString().trim();
    getSupportFragmentManager().beginTransaction().hide(fragmentDefault).show(fragmentList).commitAllowingStateLoss();
    fragmentDefault.saveSentences(this, searchString);
    fragmentList.setCondition(searchString);
    imm.hideSoftInputFromWindow(v.getWindowToken(), 0);
}