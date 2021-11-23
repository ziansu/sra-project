public void escribir(java.lang.String string) {
    byte[] buffer = string.getBytes();
    try {
        outputStream.write(buffer);
    } catch (java.io.IOException e) {
        android.util.Log.e(com.utn.juanignacio.utnecgv10.HiloConexion2.TAG, "HiloConexion.escribir(): Error al realizar la escritura", e);
        cancelarConexion();
    }
}