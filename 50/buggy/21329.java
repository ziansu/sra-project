@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    intent1.putExtra("cartype", mCarType);
    startActivity(intent1);
}