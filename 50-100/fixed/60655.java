@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(this, com.beta.tacademy.hellomoneycustomer.activity.MyQuotationActivity.class);
    intent.putExtra("page", 1);
    intent.putExtra("recyclerViewPosition", ((linearLayoutManager.findFirstCompletelyVisibleItemPosition()) + 1));
    startActivityForResult(intent, 1);
    drawer.closeDrawer(naviList);
}