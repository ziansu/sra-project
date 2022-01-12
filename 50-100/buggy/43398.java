@java.lang.Override
public java.lang.Class<? extends com.facebook.react.uimanager.ReactShadowNode> getShadowNodeClass() {
    if ((mClassName) == (com.facebook.react.views.art.ARTRenderableViewManager.CLASS_GROUP)) {
        return com.facebook.react.views.art.ARTGroupShadowNode.class;
    }else
        if ((mClassName) == (com.facebook.react.views.art.ARTRenderableViewManager.CLASS_SHAPE)) {
            return com.facebook.react.views.art.ARTShapeShadowNode.class;
        }else
            if ((mClassName) == (com.facebook.react.views.art.ARTRenderableViewManager.CLASS_TEXT)) {
                return com.facebook.react.views.art.ARTTextShadowNode.class;
            }else {
                throw new java.lang.IllegalStateException(("Unexpected type " + (mClassName)));
            }
        
    
}