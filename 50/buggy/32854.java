@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    returnable.onResult(playerDataList.get(which));
}