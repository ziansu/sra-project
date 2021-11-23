@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    region = new com.example.fernando.farmingfarming.RegionData(which);
    createModelDialogBox(cropID);
}