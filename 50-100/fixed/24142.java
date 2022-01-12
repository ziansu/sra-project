@java.lang.Override
protected void init(java.util.Map<java.lang.Integer, com.googlecode.kanbanik.client.api.Dtos.PermissionDto> permissionDtoMap) {
    this.permissionDtoMap = permissionDtoMap;
    super.init(permissionDtoMap);
    permissions.initialize();
    fillPermissionsList(permissions);
    add(permissions);
    updateContentEnabled();
    getCheckBox().addValueChangeHandler(new com.google.gwt.event.logical.shared.ValueChangeHandler<java.lang.Boolean>() {
        @java.lang.Override
        public void onValueChange(com.google.gwt.event.logical.shared.ValueChangeEvent<java.lang.Boolean> event) {
            updateContentEnabled();
        }
    });
}