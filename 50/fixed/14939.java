public void execute() {
    if (!(commonEditingCheck()))
        ensureEditing();
    
    org.geogebra.web.html5.main.DrawEquationWeb.addNewRowToMatrix(seMayLatex);
}