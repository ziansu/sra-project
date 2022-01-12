private void openLocalFile(com.seafile.seadroid2.data.EventDetailsFileItem fileItem) {
    if (fileItem.isDir()) {
        viewRepo(fileItem.getEvent().getRepo_id(), fileItem.getPath());
    }else {
        viewFile(fileItem.getEvent().getRepo_id(), fileItem.getPath());
    }
}