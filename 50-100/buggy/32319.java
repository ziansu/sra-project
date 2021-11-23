@java.lang.Override
@org.zstack.core.cloudbus.MessageSafe
public void handleMessage(org.zstack.header.message.Message msg) {
    if (msg instanceof org.zstack.storage.backup.sftp.APISearchSftpBackupStorageMsg) {
        handle(((org.zstack.storage.backup.sftp.APISearchSftpBackupStorageMsg) (msg)));
    }else
        if (msg instanceof org.zstack.storage.backup.sftp.APIGetSftpBackupStorageMsg) {
            handle(((org.zstack.storage.backup.sftp.APIGetSftpBackupStorageMsg) (msg)));
        }else
            if (msg instanceof org.zstack.storage.backup.sftp.APIQuerySftpBackupStorageMsg) {
                handle(((org.zstack.storage.backup.sftp.APIQuerySftpBackupStorageMsg) (msg)));
            }else {
                bus.dealWithUnknownMessage(msg);
            }
        
    
}