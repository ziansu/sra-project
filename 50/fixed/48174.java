@java.lang.Override
public void addField(de.jpaw.bonaparte.pojos.meta.BasicNumericElementaryDataItem di, java.math.BigInteger n) throws java.io.IOException {
    if (n != null) {
        writeSeparator();
        addRawData(numberFormat.format(n));
    }else {
        writeNull();
    }
}