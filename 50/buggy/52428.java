static com.achanr.glovercolorapp.models.GCColor getColorUsingAbbrev(java.lang.String abbrev) {
    com.achanr.glovercolorapp.models.GCColor color = null;
    for (com.achanr.glovercolorapp.models.GCColor colorItem : com.achanr.glovercolorapp.common.GCColorUtil.mColorArrayList) {
        if (abbrev.equalsIgnoreCase(colorItem.getAbbreviation())) {
            color = colorItem;
            break;
        }
    }
    return color;
}