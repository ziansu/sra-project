@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Context context = v.getContext();
    android.content.Intent intent = new android.content.Intent(context, com.simopuve.activity.PDVRowListActivity.class);
    intent.putExtra("pointOfSale", holder.mItem.getPointOfSaleName());
    intent.putExtra("position", position);
    context.startActivity(intent);
}