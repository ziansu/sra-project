public void run() {
    int auxSize = 0;
    synchronized(size) {
        auxSize = size;
        size = -1;
    }
    if (auxSize >= 0) {
        log.debug((("Quiero leer " + auxSize) + " bytes"));
        doReadAndUpload(auxSize);
    }else
        log.debug("ReadByListener NO TIENE NADA QUE SUBIR");
    
}