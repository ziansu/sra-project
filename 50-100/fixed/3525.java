@java.lang.Override
public void onClick(android.view.View v) {
    int r = new java.util.Random().nextInt(adapter.getItemCount());
    int r2 = new java.util.Random().nextInt(adapter.getItemCount());
    android.util.Log.d(jack.hive.MainActivity.TAG, ("onClick: r" + r));
    adapter.move(r, r2);
    adapter.notifyItemMoved(r, r2);
}