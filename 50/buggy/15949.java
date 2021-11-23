@java.lang.Override
public void onClick(android.view.View v) {
    startActivity(new android.content.Intent(ctx, com.engstuff.coloriphornia.activities.FavoriteColorsActivity.class));
    ctx.finish();
}