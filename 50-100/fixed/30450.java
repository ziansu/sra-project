protected void SaveHandler(hcmue.gst.off.extensions.BaseEntity entity) {
    hcmue.gst.off.entities.User user = securityService.getUser();
    if ((entity.getId()) == null) {
        entity.setCreated_by(user);
        entity.setUpdate_by(user);
        entity.setCreated_date(new java.util.Date());
        entity.setUpdate_date(new java.util.Date());
    }else {
        entity.setUpdate_date(new java.util.Date());
        entity.setUpdate_by(user);
    }
}