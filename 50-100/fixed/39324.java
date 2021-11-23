private Text.Builder applyArg(org.spongepowered.api.text.TextElement param, org.spongepowered.api.text.TextTemplate.Arg arg, @javax.annotation.Nullable
org.spongepowered.api.text.Text.Builder builder) {
    if (builder == null) {
        builder = org.spongepowered.api.text.Text.builder();
    }
    org.spongepowered.api.text.Text.Builder wrapper = org.spongepowered.api.text.Text.builder().format(arg.format);
    param.applyTo(wrapper);
    builder.append(wrapper.build());
    return builder;
}