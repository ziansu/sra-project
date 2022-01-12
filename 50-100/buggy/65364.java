private com.tmModulos.controlador.procesador.DistanciaNodos guardarDistanciaNodos(com.tmModulos.controlador.procesador.MatrizDistancia matrizDistancia, int distancia, com.tmModulos.controlador.procesador.ServicioDistancia servicioDistancia, java.lang.String nodoNombre, java.lang.String nodoCodigo) {
    com.tmModulos.controlador.procesador.DistanciaNodos distanciaNodosByServicioAndPunto = matrizDistanciaService.getDistanciaNodosByServicioAndPunto(servicioDistancia, matrizDistancia);
    if (distanciaNodosByServicioAndPunto == null) {
        com.tmModulos.controlador.procesador.DistanciaNodos distanciaNodos = new com.tmModulos.controlador.procesador.DistanciaNodos(distancia, matrizDistancia, servicioDistancia);
        distanciaNodos.setNodoNombre(nodoNombre);
        distanciaNodos.setNodoCodigo(nodoCodigo);
        matrizDistanciaService.addDistanciaNodos(distanciaNodos);
        return distanciaNodos;
    }
    return null;
}