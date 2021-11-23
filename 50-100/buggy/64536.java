@org.junit.Test
@org.springframework.security.test.context.support.WithMockUser
public void henkiloOidHetuNimiByHetuDuplicateHetus() throws java.lang.Exception {
    org.mockito.BDDMockito.given(this.henkiloService.getHenkiloOidHetuNimiByHetu("081296-967T")).willThrow(new fi.vm.sade.oppijanumerorekisteri.exceptions.DuplicateHetuException());
    this.mvc.perform(get("/henkilo/henkiloPerusByHetu/081296-967T").accept(MediaType.APPLICATION_JSON_UTF8)).andExpect(org.springframework.test.web.servlet.result.MockMvcResultMatchers.status().isInternalServerError()).andExpect(org.springframework.test.web.servlet.result.MockMvcResultMatchers.status().reason("duplicate_hetu_undeterministic_behaviour"));
}