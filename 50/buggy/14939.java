public void execute() {
    org.geogebra.web.html5.main.DrawEquationWeb.addNewRowToMatrix(seMayLatex);
    if (!(commonEditingCheck())) {
        ensureEditing();
    }
}