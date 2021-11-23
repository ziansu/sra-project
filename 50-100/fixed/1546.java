public void pushTable(boolean hasView) {
    if (hasView) {
        g.view.addTable();
    }else {
        g.addTable();
    }
    try {
        jsp.setViewportView((jt = ((javax.swing.JTable) (g.push()))));
    } catch (sourceone.pages.InputXcpt ix) {
        java.lang.System.err.println(("Error in outputting data to table:\n" + ix));
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}