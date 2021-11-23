private org.spongepowered.api.text.Text finalizeBuilder(org.spongepowered.api.text.Text text, org.spongepowered.api.text.Text.Builder build) {
    return build.style(text.getStyle()).build();
}