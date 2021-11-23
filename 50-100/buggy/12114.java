@java.lang.Override
public D getDef(org.auraframework.def.DefDescriptor<D> descriptor) throws org.auraframework.throwable.quickfix.QuickFixException {
    org.auraframework.system.Source<D> source = sourceFactory.getSource(descriptor);
    if ((source != null) && (source.exists())) {
        descriptor = source.getDescriptor();
        org.auraframework.system.Parser<D> parser = org.auraframework.impl.parser.ParserFactory.getParser(source.getFormat(), descriptor);
        D def = parser.parse(descriptor, source);
        return def;
    }
    return null;
}