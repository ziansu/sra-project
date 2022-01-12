private void resumeUpload() {
    java.util.List<com.arialyy.aria.core.upload.UploadTaskEntity> dTaskEntity = com.arialyy.aria.orm.DbEntity.findDatas(com.arialyy.aria.core.upload.UploadTaskEntity.class, "isGroupTask=?", "false");
    if ((dTaskEntity != null) && (!(dTaskEntity.isEmpty()))) {
        for (com.arialyy.aria.core.upload.UploadTaskEntity te : dTaskEntity) {
            int state = te.getState();
            if ((state == (com.arialyy.aria.core.inf.IEntity.STATE_COMPLETE)) || (state == (com.arialyy.aria.core.inf.IEntity.STATE_FAIL)))
                continue;
            
            resumeEntity(te);
        }
    }
}