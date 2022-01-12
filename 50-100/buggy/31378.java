@org.junit.Test
public void testRender() throws java.lang.Exception {
    java.util.Map<java.lang.String, java.lang.Object> model = new java.util.HashMap<java.lang.String, java.lang.Object>();
    model.put("modelAttribute", "modelValue");
    view.render(model, request, response);
    assertEquals("modelValue", request.getAttribute("modelAttribute"));
    verify(renderer).render(eq(org.springframework.web.servlet.view.tiles3.TilesViewTests.VIEW_PATH), isA(org.apache.tiles.request.Request.class));
}