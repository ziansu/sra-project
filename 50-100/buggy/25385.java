private void addTotalNum() {
    android.content.SharedPreferences sharedP = getSharedPreferences("config", junyou.com.hbtools.MODE_PRIVATE);
    int nowNum = (sharedP.getInt(mTotalNum, 0)) + 1;
    android.content.SharedPreferences.Editor editor = sharedP.edit();
    editor.putInt(mTotalNum, nowNum);
    editor.apply();
    android.util.Log.i("TAG", (("抢到总共:" + nowNum) + "个红包"));
    junyou.com.hbtools.PayUtil.YMgrasp_num(this);
}