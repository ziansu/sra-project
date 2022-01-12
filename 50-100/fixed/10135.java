protected void initialize() {
    new com.googlecode.kanbanik.client.components.common.PicturePreviewHandler(pictureUrl, assiggneePicturePreview, assigneePicturePreviewLabel, assiggneePicturePreviewErrorLabel).initialize();
    permissionsEditingComponent = new com.googlecode.kanbanik.client.components.security.PermissionsEditingComponent();
    java.util.List<com.googlecode.kanbanik.client.api.Dtos.PermissionDto> permissions = ((oldDto) != null) ? oldDto.getPermissions() : java.util.Collections.EMPTY_LIST;
    permissions = (permissions != null) ? permissions : java.util.Collections.EMPTY_LIST;
    permissionsEditingComponent.init(permissions, oldDto);
    permissionsPanel.clear();
    permissionsPanel.add(permissionsEditingComponent);
}