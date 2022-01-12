@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(context, com.brand.ushopping.activity.GoodsActivity.class);
    android.os.Bundle bundle = new android.os.Bundle();
    bundle.putLong("goodsId", ((java.lang.Long) (list.get(position).get("id"))));
    bundle.putInt("boughtType", ((int) (list.get(position).get("boughtType"))));
    intent.putExtras(bundle);
    context.startActivity(intent);
}