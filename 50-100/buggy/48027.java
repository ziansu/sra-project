@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(this, com.beta.tacademy.hellomoneycustomer.activity.MyQuotationActivity.class);
    intent.putExtra("page", 0);
    intent.putExtra("recyclerViewPosition", linearLayoutManager.findFirstCompletelyVisibleItemPosition());
    startActivityForResult(intent, 1);
    drawer.closeDrawer(naviList);
}