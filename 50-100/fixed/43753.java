public void testFilterByLastname() {
    org.camunda.bpm.engine.identity.User user = identityService.createUserQuery().userLastName("The Crouch").singleResult();
    assertNotNull(user);
    user = identityService.createUserQuery().userLastName("non-existing").singleResult();
    assertNull(user);
}