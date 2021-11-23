@org.junit.Test
public void obtenerArt_articuloPorId_retornaArt() {
    com.service.ArticuloService articuloService = new com.service.ArticuloService();
    long id = 1;
    com.merceria.model.Articulo articulo = articuloService.obtenerArt(id);
    assertEquals(1L, articulo.getId());
}