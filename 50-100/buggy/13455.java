public void setPublishChecked(boolean checked) {
    if ((service) == null)
        return ;
    
    publishChecked = checked;
    service.setPublished((publishChecked ? ((short) (1)) : ((short) (0))));
}