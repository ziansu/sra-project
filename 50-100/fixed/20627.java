@java.lang.Override
public com.facebook.react.uimanager.ReactShadowNode createShadowNodeInstance() {
    if (com.facebook.react.views.art.ARTRenderableViewManager.CLASS_GROUP.equals(mClassName)) {
        return new com.facebook.react.views.art.ARTGroupShadowNode();
    }else
        if (com.facebook.react.views.art.ARTRenderableViewManager.CLASS_SHAPE.equals(mClassName)) {
            return new com.facebook.react.views.art.ARTShapeShadowNode();
        }else
            if (com.facebook.react.views.art.ARTRenderableViewManager.CLASS_TEXT.equals(mClassName)) {
                return new com.facebook.react.views.art.ARTTextShadowNode();
            }else {
                throw new java.lang.IllegalStateException(("Unexpected type " + (mClassName)));
            }
        
    
}