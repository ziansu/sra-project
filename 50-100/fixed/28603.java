@org.junit.Ignore
public void saveData() {
    java.util.List<com.duggan.workflow.shared.model.DocumentLine> lines = new java.util.ArrayList<>();
    com.duggan.workflow.shared.model.DocumentLine line = new com.duggan.workflow.shared.model.DocumentLine();
    line.addValue("administration", new com.duggan.workflow.shared.model.DoubleValue(0.0));
    lines.add(line);
    com.duggan.workflow.server.dao.helper.CatalogDaoHelper.saveData(26L, lines, false);
}