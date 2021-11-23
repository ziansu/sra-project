@java.lang.Override
public void recompute() {
    java.util.Iterator<spreadsheet.Cell> i = changed.iterator();
    while (i.hasNext()) {
        spreadsheet.Cell c = i.next();
        java.lang.String expr = c.getExpr();
        c.setVal(new spreadsheet.StringValue(expr));
        changed.remove(c);
    } 
}