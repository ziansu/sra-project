@org.junit.Test
public void addToCartIfInStockTest() throws java.lang.Exception {
    com.acme.ecommerce.domain.Product product = productBuilder();
    org.mockito.Mockito.when(productService.findById(1L)).thenReturn(product);
    mockMvc.perform(org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post("/cart/add").param("quantity", "10").param("productId", "1")).andDo(org.springframework.test.web.servlet.result.MockMvcResultHandlers.print()).andExpect(status().is3xxRedirection()).andExpect(redirectedUrl("/error"));
}