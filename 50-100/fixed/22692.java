public void apagar() {
    try {
        if ((Cliente.sesion) != null) {
            Cliente.sesion.cerrarSesion();
            Cliente.sesion = null;
        }
        java.lang.Process proceso = java.lang.Runtime.getRuntime().exec("shutdown /p");
        java.lang.System.exit(0);
    } catch (java.io.IOException e) {
        java.lang.System.out.println("Excepción: ");
        e.printStackTrace();
    }
}