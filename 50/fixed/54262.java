public int getProfemonDrawableResourceId(java.lang.String iconName) {
    return this.context.getResources().getIdentifier(iconName.toLowerCase(), "drawable", context.getPackageName());
}