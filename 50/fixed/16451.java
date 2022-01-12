@java.lang.Override
public void onClick(android.view.View view) {
    startActivity(new android.content.Intent(android.content.Intent.ACTION_VIEW, ItemsContract.Items.buildItemUri(getItemId(vh.getAdapterPosition()))));
}