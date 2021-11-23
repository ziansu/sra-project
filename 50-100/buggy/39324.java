private Text.Builder applyArg(org.spongepowered.api.text.TextElement param, org.spongepowered.api.text.TextTemplate.Arg arg, @javax.annotation.Nullable
org.spongepowered.api.text.Text.Builder builder) {
    org.spongepowered.api.text.Text.Builder wrapper = org.spongepowered.api.text.Text.builder().format(arg.format);
    param.applyTo(wrapper);
    if (builder == null) {
        builder = wrapper;
    }else {
        builder.append(wrapper.build());
    }
    return builder;
}