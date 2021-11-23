@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(context, it.zerocool.batmacaana.DetailsActivity.class);
    int type = contentItems.get(getPosition()).getType();
    intent.putExtra(Constraints.JSON_ARG, contentItems.get(getPosition()).getJson());
    intent.putExtra(Constraints.TYPE_ARG, type);
    context.startActivity(intent);
}