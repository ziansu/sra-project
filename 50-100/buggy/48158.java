public static void applyInsertDeleteRule(model.DML dml, java.util.List<model.DML> recordDMLs, java.util.List<model.DML> fkDMLs) {
    for (model.DML recordDML : recordDMLs) {
        main.Combiner.removeDML(recordDML);
        model.DMLQueue.RemoveDML(recordDML);
    }
    for (model.DML fkDML : fkDMLs) {
        main.Combiner.removeDML(fkDML);
        model.DMLQueue.RemoveDML(fkDML);
    }
}