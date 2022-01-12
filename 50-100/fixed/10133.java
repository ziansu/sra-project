private void setImageSource(java.lang.Object object) {
    imageSources = new java.util.ArrayList<org.appcelerator.titanium.view.TiDrawableReference>();
    if (object instanceof java.lang.Object[]) {
        for (java.lang.Object o : ((java.lang.Object[]) (object))) {
            imageSources.add(org.appcelerator.titanium.view.TiDrawableReference.fromObject(getProxy(), o));
        }
    }else {
        imageSources.add(org.appcelerator.titanium.view.TiDrawableReference.fromObject(getProxy(), object));
    }
}