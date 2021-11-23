@java.lang.Override
public ec.tss.tsproviders.sdmx.DataSet toDataSet(ec.tss.TsMoniker moniker) throws java.lang.IllegalArgumentException {
    ec.tss.tsproviders.sdmx.DataSet result = super.toDataSet(moniker);
    if (result != null) {
        return result;
    }
    java.lang.String id = moniker.getId();
    return id != null ? legacyDataSetParser.parse(id) : null;
}