@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int i) {
    initThread();
    mCommand += "-aoa";
    mThread.start();
    mDialog.showDialog(R.raw.decompress);
    mDialog.changeTitle(mContext.getResources().getString(R.string.compress_info));
}