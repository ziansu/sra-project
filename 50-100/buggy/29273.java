@java.lang.Override
public void onPageSelected(int position) {
    currentItem = position;
    if ((currentItem) >= ((level.getSections().size()) - 1)) {
        android.content.Intent intent = new android.content.Intent(mContext, com.hanaone.tprd.ResultActivity.class);
        intent.putExtra(Constants.LEVEL, level);
        startActivity(intent);
    }
}