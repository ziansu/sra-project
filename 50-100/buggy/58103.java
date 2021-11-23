private void processCommand(byte[] command) {
    try {
        java.lang.String strCommand = new java.lang.String(command);
        java.lang.System.out.println(("Marcar asistencia para el estudiante: " + strCommand));
        java.lang.String resultado = new arq.prototipo.rest.ClienteRest().marcarAsistencia("strCommand", "1");
        if (resultado.contains("true")) {
            java.lang.System.out.println("Asistencia marcada");
        }else {
            java.lang.System.out.println("Error al marcar asistencia");
        }
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(e.getMessage());
    }
}