public int copyView(int viewId, java.lang.String newName) throws io.lumeer.engine.api.exception.UnauthorizedAccessException, io.lumeer.engine.api.exception.ViewAlreadyExistsException, io.lumeer.engine.api.exception.ViewMetadataNotFoundException {
    final io.lumeer.engine.api.data.DataDocument originalView = getViewMetadataWithoutAccessCheck(viewId);
    if (!(securityFacade.checkForRead(originalView, getCurrentUser()))) {
        return createView(newName, originalView.getString(LumeerConst.View.VIEW_TYPE_KEY), originalView.getDataDocument(LumeerConst.View.VIEW_CONFIGURATION_KEY));
    }else {
        throw new io.lumeer.engine.api.exception.UnauthorizedAccessException();
    }
}