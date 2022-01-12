@org.junit.Test
@org.springframework.transaction.annotation.Transactional
public void getOwner() throws java.lang.Exception {
    ownerRepository.saveAndFlush(owner);
    restOwnerMockMvc.perform(get("/api/owners/{id}", owner.getId())).andExpect(status().isOk()).andExpect(content().contentType(MediaType.APPLICATION_JSON)).andExpect(jsonPath("$.id").value(owner.getId().intValue()));
}