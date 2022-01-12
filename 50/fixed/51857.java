@java.lang.Override
protected void onClick(android.content.Context context) {
    if ((fileType) != (com.frostwire.android.core.Constants.FILE_TYPE_RINGTONES)) {
        com.frostwire.android.gui.util.UIUtils.openFile(context, path, mime, true);
    }else {
        com.andrew.apollo.utils.MusicUtils.playSimple(path);
    }
}