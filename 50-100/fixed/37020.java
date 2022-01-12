public static boolean SN(java.lang.String sn, java.lang.String campo) {
    java.lang.String regex = "^(\\s*[NS]\\s*)$";
    if (sn.matches(regex)) {
        return true;
    }else {
        br.com.guarani.rta.validador.UtilsValidator.registro = new br.com.guarani.rta.entidade.Registros(campo, sn, " S ou N, somente", "Dados inv�lidos");
        br.com.guarani.rta.validador.UtilsValidator.registros.add(br.com.guarani.rta.validador.UtilsValidator.registro);
        return false;
    }
}