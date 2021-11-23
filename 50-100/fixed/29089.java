public void run() {
    int auxSize = 0;
    synchronized(size) {
        auxSize = size;
        size = -1;
    }
    if (auxSize >= 0) {
        log.info((("Quiero leer " + auxSize) + " bytes"));
        doReadAndUpload(auxSize);
    }else
        log.info("ReadByListener NO TIENE NADA QUE SUBIR");
    
}