@java.lang.Override
public weka.core.Instance getTestInstanceForSize(java.lang.String dbName, edu.umich.gpd.schema.Schema s, edu.umich.gpd.database.common.Structure structure) {
    weka.core.Instance newInstance = new weka.core.DenseInstance(trainDataForSize.numAttributes());
    int idx = 0;
    for (edu.umich.gpd.schema.Table t : s.getTables()) {
        newInstance.setValue((idx++), t.getRowCount(dbName));
    }
    newInstance.setValue((idx++), structure.getName());
    return newInstance;
}