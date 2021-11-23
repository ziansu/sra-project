public void setBootstrapType(java.lang.String bootstrapType) {
    com.beardedhen.androidbootstrap.BootstrapButton.BootstrapTypes type;
    if (roundedCorners) {
        type = com.beardedhen.androidbootstrap.BootstrapButton.bbuttonTypeMapRounded.get(bootstrapType);
    }else {
        type = com.beardedhen.androidbootstrap.BootstrapButton.bbuttonTypeMap.get(bootstrapType);
    }
    if (type == null) {
        type = com.beardedhen.androidbootstrap.BootstrapButton.BootstrapTypes.DEFAULT;
    }
    layout.setBackgroundResource(type.backgroundDrawable);
    lblLeft.setTextColor(getResources().getColor(type.textColour));
    lblMiddle.setTextColor(getResources().getColor(type.textColour));
    lblRight.setTextColor(getResources().getColor(type.textColour));
}