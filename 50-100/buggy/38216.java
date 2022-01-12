@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(context, it.zerocool.batmacaana.DetailsActivity.class);
    intent.putExtra(Constraints.JSON_ARG, contentItems.get(getPosition()).getJson());
    intent.putExtra(Constraints.TYPE_ARG, contentItems.get(getPosition()).getType());
    context.startActivity(intent);
}