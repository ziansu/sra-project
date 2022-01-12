public void apagar() {
    try {
        Cliente.sesion.cerrarSesion();
        java.lang.Process proceso = java.lang.Runtime.getRuntime().exec("shutdown /p");
        java.lang.System.exit(0);
    } catch (java.io.IOException e) {
        java.lang.System.out.println("Excepción: ");
        e.printStackTrace();
    }
}