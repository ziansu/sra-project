@java.lang.Override
public void run() {
    addItemsToMap();
    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("EEEE, dd MMMM yyyy HH:mm:ss");
    java.util.Date resultdate = new java.util.Date(networkTS);
    android.widget.Toast toast = android.widget.Toast.makeText(getActivity().getApplicationContext(), ("+networkTS+:" + (sdf.format(resultdate))), Toast.LENGTH_LONG);
    toast.setGravity(Gravity.TOP, 0, 0);
    toast.show();
}