@org.junit.Test
public void experimentNotFound() throws java.lang.Exception {
    this.mockMvc.perform(org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get(java.lang.String.format(uk.ac.ebi.atlas.tracks.GenomeBrowserControllerWIT.URL_TEMPLATE, "ensembl", "E-FOO-BAR", "ENSG00000102970", "g13"))).andExpect(org.springframework.test.web.servlet.result.MockMvcResultMatchers.status().isNotFound()).andExpect(org.springframework.test.web.servlet.result.MockMvcResultMatchers.view().name("error-page"));
}