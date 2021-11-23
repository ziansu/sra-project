@org.junit.Test
public void testGetRecipe() throws java.lang.Exception {
    guru.springframework.domain.Recipe recipe = new guru.springframework.domain.Recipe();
    recipe.setId(1L);
    org.springframework.test.web.servlet.MockMvc mockMvc = org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup(controller).build();
    mockMvc.perform(org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get("/recipe/show/1")).andExpect(status().isOk()).andExpect(view().name("recipe/show"));
}