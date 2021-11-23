public void checkCampoUsado(org.eclipse.emf.ecore.EObject obj) {
    java.util.List<es.fap.simpleled.validation.Campo> campos = es.fap.simpleled.led.util.LedCampoUtils.buscarCamposRecursivos(obj);
    java.util.Set<java.lang.String> unicos = new java.util.HashSet<java.lang.String>();
    java.lang.String campoStr = "";
    for (es.fap.simpleled.validation.Campo campo : campos) {
        campoStr = es.fap.simpleled.led.util.LedCampoUtils.getCampoStr(campo);
        if (!(unicos.contains(campoStr))) {
            unicos.add(campoStr);
        }else {
            warning("El campo esta siendo utilizado por otro elemento en la misma pagina", campo, LedPackage.Literals.CAMPO__ATRIBUTOS, 0);
        }
    }
}