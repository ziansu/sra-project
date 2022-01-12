@java.lang.Override
public void onClick(android.view.View v) {
    com.common.PreferanceUtil preferanceUtil = new com.common.PreferanceUtil(mContext);
    preferanceUtil.setCardDetail(mCard);
    com.common.SingletonClass.sharedInstance().setCard(mCard);
    android.content.Intent intent = new android.content.Intent(getActivity(), com.marchant.HomeActivity.class);
    intent.putExtra("ActivityName", "Splash");
    startActivity(intent);
}