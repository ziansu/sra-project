private void setDefaultImageSource(java.lang.Object object) {
    if (object instanceof ti.modules.titanium.filesystem.FileProxy) {
        defaultImageSource = org.appcelerator.titanium.view.TiDrawableReference.fromFile(proxy.getActivity(), ((ti.modules.titanium.filesystem.FileProxy) (object)).getBaseFile());
    }else
        if (object instanceof java.lang.String) {
            defaultImageSource = org.appcelerator.titanium.view.TiDrawableReference.fromUrl(proxy, ((java.lang.String) (object)));
        }else {
            defaultImageSource = org.appcelerator.titanium.view.TiDrawableReference.fromObject(proxy, object);
        }
    
}