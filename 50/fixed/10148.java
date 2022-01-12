@java.lang.Override
public void run() {
    try {
        if ((org.wso2.developerstudio.eclipse.updater.job.UpdateMetaFileReaderJobListener.getUserPreference(org.wso2.developerstudio.eclipse.updater.job.UpdateMetaFileReaderJobListener.TITLE, org.wso2.developerstudio.eclipse.updater.job.UpdateMetaFileReaderJobListener.UPDATER_DIALOG_MESSAGE)) == 0) {
            runUpdaterJob();
        }
    } catch (java.lang.Exception e) {
        org.wso2.developerstudio.eclipse.updater.job.UpdateMetaFileReaderJobListener.log.error(Messages.UpdatemetaFileReaderJobListener_0, e);
    }
}