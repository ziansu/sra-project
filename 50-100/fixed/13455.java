public void setPublishChecked(boolean checked) {
    if ((service) == null) {
        publishChecked = false;
    }else {
        publishChecked = checked;
        service.setPublished((publishChecked ? ((short) (1)) : ((short) (0))));
    }
}