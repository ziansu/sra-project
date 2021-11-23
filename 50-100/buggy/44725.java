@java.lang.Override
public void addField(de.jpaw.bonaparte.pojos.meta.TemporalElementaryDataItem di, org.joda.time.LocalDateTime t) throws java.io.IOException {
    writeSeparator();
    if (t != null) {
        if (cfg.datesQuoted)
            addRawData(stringQuote);
        
        if ((di.getFractionalSeconds()) <= 0)
            addRawData(timestampFormat.print(t));
        else
            addRawData(timestamp3Format.print(t));
        
        if (cfg.datesQuoted)
            addRawData(stringQuote);
        
    }else {
        writeNull(di);
    }
}