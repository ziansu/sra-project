@java.lang.Override
public void onClick(android.view.View v) {
    mSyncFolderItems.get(section).setEnabled((!(mSyncFolderItems.get(section).isEnabled())));
    setSyncButtonActiveIcon(holder.syncStatusButton, mSyncFolderItems.get(section).isEnabled());
    mListener.onSyncStatusToggleClick(section, mSyncFolderItems.get(section));
}