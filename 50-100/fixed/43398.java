@java.lang.Override
public java.lang.Class<? extends com.facebook.react.uimanager.ReactShadowNode> getShadowNodeClass() {
    if (com.facebook.react.views.art.ARTRenderableViewManager.CLASS_GROUP.equals(mClassName)) {
        return com.facebook.react.views.art.ARTGroupShadowNode.class;
    }else
        if (com.facebook.react.views.art.ARTRenderableViewManager.CLASS_SHAPE.equals(mClassName)) {
            return com.facebook.react.views.art.ARTShapeShadowNode.class;
        }else
            if (com.facebook.react.views.art.ARTRenderableViewManager.CLASS_TEXT.equals(mClassName)) {
                return com.facebook.react.views.art.ARTTextShadowNode.class;
            }else {
                throw new java.lang.IllegalStateException(("Unexpected type " + (mClassName)));
            }
        
    
}