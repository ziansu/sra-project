@java.lang.Override
public boolean escribirObjeto(java.lang.Object objeto) {
    try {
        if ((outStream) == null) {
            if ((inStream) != null) {
                inStream.close();
                inStream = null;
            }
            outStream = getOutStream(archivo.exists());
        }
        outStream.writeObject(archivo);
        outStream.flush();
        return true;
    } catch (java.io.IOException e) {
        return false;
    }
}