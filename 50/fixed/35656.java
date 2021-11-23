@java.lang.Override
public void addField(de.jpaw.bonaparte.pojos.meta.AlphanumericElementaryDataItem di, java.lang.String s) throws java.io.IOException {
    writeString(((replaceSeparator) && (s != null) ? s.replace(cfg.separator, cfg.quoteReplacement) : s));
}