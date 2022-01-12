private org.spongepowered.api.text.Text addSpaces(org.spongepowered.api.text.Text spaces, org.spongepowered.api.text.Text text) {
    org.spongepowered.api.text.Text.Builder build = org.spongepowered.api.text.Text.builder().color(text.getColor()).style(text.getStyle());
    build.append(spaces);
    build.append(text);
    build.append(spaces);
    return build.build();
}