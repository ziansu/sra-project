@java.lang.Override
public void onClick(android.view.View v) {
    if (!(empty)) {
        android.util.Log.d("onClickLocation", (((l.longitude()) + " ") + (l.latitude())));
        android.content.Intent i = new android.content.Intent(context, com.designforamerica.seek.LocationActivity.class);
        i.putExtra("id", l.id());
        context.startActivity(i);
    }
}