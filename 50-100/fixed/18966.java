public void setBackgroundFromProperties(org.appcelerator.kroll.KrollDict props) {
    android.graphics.drawable.Drawable background = null;
    if (props.containsKey(TiC.PROPERTY_BACKGROUND_IMAGE)) {
        background = getBackgroundImageDrawable(props, TiC.PROPERTY_BACKGROUND_IMAGE);
    }else
        if (props.containsKey(TiC.PROPERTY_BACKGROUND_COLOR)) {
            java.lang.Integer bgColor = org.appcelerator.titanium.util.TiConvert.toColor(props, TiC.PROPERTY_BACKGROUND_COLOR);
            background = new android.graphics.drawable.ColorDrawable(bgColor);
        }
    
    setBackgroundDrawable(props, background);
}