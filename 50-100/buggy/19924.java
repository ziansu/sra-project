@java.lang.Override
public void onConfirm(java.lang.String text, int type, int operation, int option) {
    com.z299studio.pb.Application.FileHeader header = Application.FileHeader.parse(mData);
    if (text != null) {
        new com.z299studio.pb.DecryptTask(mData, header, this).execute(text);
    }else {
        mApp.increaseVersion(header.revision);
        com.z299studio.pb.SyncService.getInstance().send(mApp.getData());
    }
}