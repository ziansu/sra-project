@java.lang.Override
public void run(java.lang.Boolean success, java.lang.Exception error) {
    if (success != null) {
        list.remove(position);
        notifyDataSetChanged();
    }else {
        android.util.Log.d("a", "CANNOT REMOVE RULE!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }
}