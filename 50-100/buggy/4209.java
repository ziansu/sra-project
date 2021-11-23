@java.lang.Override
public ec.tss.tsproviders.sdmx.DataSet toDataSet(ec.tss.TsMoniker moniker) throws java.lang.IllegalArgumentException {
    ec.tss.tsproviders.sdmx.DataSet result = super.toDataSet(moniker);
    if (result != null) {
        return result;
    }
    synchronized(legacyDataSetParser) {
        return legacyDataSetParser.parse(moniker.getId());
    }
}