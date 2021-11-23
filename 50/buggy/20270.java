@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    mListener.onNewGameCreate(setOption, ((playerOption) + 1), rulesOption);
}