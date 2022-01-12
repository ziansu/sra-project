@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(context, zoom.city.android.main.pages.smallbaners.SmallBanersPreviewPage.class);
    intent.putExtra("title", zoom.city.android.main.container.DataContainer.getInstance().getSmallBanerItemList().get(title).get(1).getCategory());
    intent.putExtra("id", "10");
    intent.putExtra("date", "");
    ((android.app.Activity) (context)).startActivity(intent);
}