@java.lang.Override
public int compareTo(com.curecomp.primefaces.migrator.WidgetVarLocation o) {
    int cmp = location.compareTo(o.location);
    cmp = (cmp != 0) ? cmp : widgetVar.compareTo(o.widgetVar);
    cmp = (cmp != 0) ? cmp : java.lang.Integer.compare(lineNr, o.lineNr);
    cmp = (cmp != 0) ? cmp : java.lang.Integer.compare(columnNr, o.columnNr);
    return cmp;
}