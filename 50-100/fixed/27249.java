@java.lang.Override
protected de.bayerl.statistics.model.Table transformStep(de.bayerl.statistics.model.Table table) {
    de.bayerl.statistics.transformer.DeepCopyUtil deepCopyUtil = new de.bayerl.statistics.transformer.DeepCopyUtil();
    for (de.bayerl.statistics.model.Row row : table.getRows()) {
        if ((colNumber) == (row.getCells().size())) {
            row.getCells().add(deepCopyUtil.deepCopy(cell));
        }else {
            row.getCells().add(colNumber, deepCopyUtil.deepCopy(cell));
        }
    }
    return table;
}