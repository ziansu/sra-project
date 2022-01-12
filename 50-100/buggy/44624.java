@java.lang.Override
public void addField(de.jpaw.bonaparte.pojos.meta.TemporalElementaryDataItem di, org.joda.time.LocalDate t) throws java.io.IOException {
    writeSeparator();
    if (t != null) {
        if (cfg.datesQuoted)
            addRawData(stringQuote);
        
        addRawData(dayFormat.print(t));
        if (cfg.datesQuoted)
            addRawData(stringQuote);
        
    }else {
        writeNull(di);
    }
}