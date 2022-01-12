@org.junit.Test
@org.springframework.transaction.annotation.Transactional
public void getAllOwners() throws java.lang.Exception {
    ownerRepository.saveAndFlush(owner);
    restOwnerMockMvc.perform(get("/api/owners")).andExpect(status().isOk()).andExpect(content().contentType(MediaType.APPLICATION_JSON)).andExpect(jsonPath("$.[*].id").value(org.hamcrest.Matchers.hasItem(owner.getId().intValue())));
}