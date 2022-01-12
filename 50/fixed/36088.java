@java.lang.Override
public void onClickItem(android.view.View v, int position) {
    android.content.Intent intent = new android.content.Intent(this, com.abyx.loyalty.activities.CardActivity.class);
    intent.putExtra(Constants.INTENT_CARD_ID_ARG, data.get(position).getID());
    startActivity(intent);
}