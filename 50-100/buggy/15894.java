private void openLocalFile(com.seafile.seadroid2.data.EventDetailsFileItem fileItem) {
    if (fileItem.isDir()) {
        viewRepo(fileItem.getEvent().getRepo_id());
    }else {
        viewFile(fileItem.getEvent().getRepo_id(), fileItem.getPath());
    }
}