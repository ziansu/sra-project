@java.lang.Override
public void visit(org.opencompare.api.java.Product prdct) {
    for (org.opencompare.api.java.Cell cell : prdct.getCells()) {
        cell.accept(this);
    }
}