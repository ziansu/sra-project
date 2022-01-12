@org.junit.Test
public void obtenerArt_articuloPorId_retornaArt() {
    com.service.ArticuloService articuloService = new com.service.ArticuloService();
    java.lang.Long id = new java.lang.Long(1);
    com.merceria.model.Articulo articulo = articuloService.obtenerArt(id);
    assertEquals(id, articulo.getId());
}