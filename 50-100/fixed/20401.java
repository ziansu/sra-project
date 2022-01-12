private org.spongepowered.api.text.Text addSpaces(org.spongepowered.api.text.Text spaces, org.spongepowered.api.text.Text text) {
    return org.spongepowered.api.text.Text.builder().append(spaces).append(text).append(spaces).color(text.getColor()).style(text.getStyle()).build();
}