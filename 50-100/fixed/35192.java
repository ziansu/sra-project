@java.lang.Override
public boolean onLongClick(android.view.View v) {
    android.content.SharedPreferences sharedPref = v.getContext().getSharedPreferences("Ride_id", Context.MODE_APPEND);
    android.content.SharedPreferences.Editor editor = sharedPref.edit();
    android.widget.Toast.makeText(v.getContext(), "RIDES DELETED", Toast.LENGTH_SHORT).show();
    editor.putInt("ride_id", (-1));
    editor.commit();
    return true;
}