@java.lang.Override
public void onClick(android.view.View view) {
    intent.putExtra("linia", lines.get(x).getTag());
    intent.putExtra("linia_id", x);
    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    ctx.startActivity(intent);
}