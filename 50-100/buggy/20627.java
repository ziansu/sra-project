@java.lang.Override
public com.facebook.react.uimanager.ReactShadowNode createShadowNodeInstance() {
    if ((mClassName) == (com.facebook.react.views.art.ARTRenderableViewManager.CLASS_GROUP)) {
        return new com.facebook.react.views.art.ARTGroupShadowNode();
    }else
        if ((mClassName) == (com.facebook.react.views.art.ARTRenderableViewManager.CLASS_SHAPE)) {
            return new com.facebook.react.views.art.ARTShapeShadowNode();
        }else
            if ((mClassName) == (com.facebook.react.views.art.ARTRenderableViewManager.CLASS_TEXT)) {
                return new com.facebook.react.views.art.ARTTextShadowNode();
            }else {
                throw new java.lang.IllegalStateException(("Unexpected type " + (mClassName)));
            }
        
    
}