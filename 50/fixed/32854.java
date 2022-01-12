@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    if (which == 0) {
        returnable.onResult(null);
    }else {
        returnable.onResult(playerDataList.get((which - 1)));
    }
}