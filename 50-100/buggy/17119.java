@java.lang.Override
public void onClick(android.view.View v) {
    mListener.onSyncStatusToggleClick(section, mSyncFolderItems.get(section));
    mSyncFolderItems.get(section).setEnabled((!(mSyncFolderItems.get(section).isEnabled())));
    setSyncButtonActiveIcon(holder.syncStatusButton, mSyncFolderItems.get(section).isEnabled());
}