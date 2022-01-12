private void whileRetrievingMessagesDo(final java.lang.Runnable action) throws java.lang.Exception {
    whenRetrievingMessages().thenAnswer(new org.mockito.stubbing.Answer<java.lang.Object>() {
        @java.lang.Override
        public java.lang.Object answer(org.mockito.invocation.InvocationOnMock invocation) throws java.lang.Throwable {
            action.run();
            return messageList();
        }
    });
}