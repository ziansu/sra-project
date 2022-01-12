@java.lang.Override
public void onClick(android.view.View v) {
    com.frostwire.android.gui.services.Engine.instance().stopServices(false);
    com.frostwire.android.gui.util.UIUtils.openFile(context, com.frostwire.android.gui.SoftwareUpdater.getUpdateApk().getAbsolutePath(), Constants.MIME_TYPE_ANDROID_PACKAGE_ARCHIVE, false);
    newSoftwareUpdaterDialog.dismiss();
}