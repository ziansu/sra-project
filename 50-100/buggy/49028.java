public void mostrarProducto() {
    patrones.diariofacil.ServicioProducto SP = new patrones.diariofacil.ServicioProducto();
    try {
        for (patrones.diariofacil.Product p : SP.buscaTodos()) {
            lstProducto.add(new patrones.diariofacil.Product(p.getId(), p.getName(), p.getDescription(), p.getPrice(), p.getProvider(), p.getActualStock(), p.getMinimunStock()));
        }
    } catch (java.lang.Exception ex) {
        ex.printStackTrace();
    }
}