public void clearView() {
    if ((pyInterface) != null) {
        geogebra.plugin.jython.PythonAPI.getInstance().setInitScript("");
        pyInterface.reset();
    }
}