protected com.floatingmuseum.mocloud.data.entity.Colors buildColors(android.support.v7.graphics.Palette.Swatch swatch) {
    com.floatingmuseum.mocloud.data.entity.Colors colors = new com.floatingmuseum.mocloud.data.entity.Colors();
    colors.setRgb(swatch.getRgb());
    colors.setHsl(swatch.getHsl());
    colors.setPopulation(swatch.getPopulation());
    colors.setTitleTextColor(swatch.getTitleTextColor());
    colors.setBodyTextColor(swatch.getBodyTextColor());
    return colors;
}