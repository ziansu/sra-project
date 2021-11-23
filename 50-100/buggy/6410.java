@org.junit.Test
public void noExistenCarrosFavoritos() {
    org.springframework.mock.web.MockHttpServletRequest request = new org.springframework.mock.web.MockHttpServletRequest();
    org.springframework.ui.ExtendedModelMap model = new org.springframework.ui.ExtendedModelMap();
    request.getSession().setAttribute("user", es.unizar.es.foodnet.model.CarroFavoritoTest.user);
    ccf.cargarFavoritos(model, request);
    org.junit.Assert.assertEquals(0, ((java.util.List<es.unizar.es.foodnet.model.CarroFavorito>) (model.get("carrosFavoritos"))).size());
}