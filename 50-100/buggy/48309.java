@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    java.lang.String selected = ((java.lang.String) (lv.getAdapter().getItem(position)));
    ft.dismiss();
    ft.getCallback().apply(ft.requestCode(), prefs.getString(selected, null));
}