@org.junit.Test
@org.springframework.security.test.context.support.WithMockUser
public void shouldFollow() throws java.lang.Exception {
    com.sysc4806.User u2 = new com.sysc4806.User();
    userRepository.save(u2);
    com.sysc4806.User user = com.sysc4806.AuthenticationController.CurrentUser();
    this.mockMvc.perform(org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get(("/user/follow?id=" + (u2.getId())))).andExpect(org.springframework.test.web.servlet.result.MockMvcResultMatchers.status().isOk());
    user = userRepository.findOne(user.getId());
    assert user.isFollowing(u2);
}