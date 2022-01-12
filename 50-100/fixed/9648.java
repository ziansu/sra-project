public void setBootstrapType(java.lang.String bootstrapType) {
    com.beardedhen.androidbootstrap.BootstrapButton.BootstrapTypes type;
    type = (roundedCorners) ? com.beardedhen.androidbootstrap.BootstrapButton.bbuttonTypeMapRounded.get(bootstrapType) : com.beardedhen.androidbootstrap.BootstrapButton.bbuttonTypeMap.get(bootstrapType);
    type = (type == null) ? com.beardedhen.androidbootstrap.BootstrapButton.BootstrapTypes.DEFAULT : type;
    layout.setBackgroundResource(type.backgroundDrawable);
    lblLeft.setTextColor(getResources().getColor(type.textColour));
    lblMiddle.setTextColor(getResources().getColor(type.textColour));
    lblRight.setTextColor(getResources().getColor(type.textColour));
}