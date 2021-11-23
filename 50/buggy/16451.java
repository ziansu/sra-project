@java.lang.Override
public void onClick(android.view.View view) {
    view.setElevation(getResources().getDimension(R.dimen.elevation_card_pressed));
    startActivity(new android.content.Intent(android.content.Intent.ACTION_VIEW, ItemsContract.Items.buildItemUri(getItemId(vh.getAdapterPosition()))));
}