static net.time4j.format.expert.AttributeSet createDefaults(net.time4j.engine.Chronology<?> chronology, java.util.Locale locale) {
    net.time4j.format.Attributes.Builder builder = new net.time4j.format.Attributes.Builder(chronology);
    builder.set(Attributes.LENIENCY, Leniency.SMART);
    builder.set(Attributes.TEXT_WIDTH, TextWidth.WIDE);
    builder.set(Attributes.OUTPUT_CONTEXT, OutputContext.FORMAT);
    builder.set(Attributes.PAD_CHAR, ' ');
    net.time4j.format.expert.AttributeSet as = new net.time4j.format.expert.AttributeSet(builder.build(), locale);
    return as.withLocale(locale);
}