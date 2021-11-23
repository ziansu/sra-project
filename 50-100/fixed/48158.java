public static void applyInsertDeleteRule(model.DML dml, java.util.List<model.DML> recordDMLs, java.util.List<model.DML> fkDMLs) {
    while ((recordDMLs.size()) != 0) {
        model.DML recordDML = recordDMLs.get(0);
        main.Combiner.removeDML(recordDML);
        model.DMLQueue.RemoveDML(recordDML);
    } 
    while ((fkDMLs.size()) != 0) {
        model.DML fkDML = fkDMLs.get(0);
        main.Combiner.removeDML(fkDML);
        model.DMLQueue.RemoveDML(fkDML);
    } 
}