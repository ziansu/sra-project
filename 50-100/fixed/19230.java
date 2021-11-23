@org.junit.Test
public void testGetStoresByProductId_POST_ShouldReturnViewName() throws java.lang.Exception {
    mockMvc.perform(org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post("/product/stores").param("productId", "1").sessionAttr("storesInProduct", new com.softserve.if072.mvcapp.dto.StoresInProduct())).andExpect(status().isFound()).andExpect(view().name("redirect:/product/"));
    verify(productPageService, times(1)).updateStoresInProduct(any(com.softserve.if072.mvcapp.dto.StoresInProduct.class), org.mockito.ArgumentMatchers.anyInt());
}