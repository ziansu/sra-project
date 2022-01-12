private com.github.maximilientyc.conversations.restadapter.Conversation getConversationHttp(java.lang.String location) throws java.lang.Exception {
    org.springframework.test.web.servlet.MockMvc mockMvc = org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup(conversationController).build();
    org.springframework.test.web.servlet.MvcResult getMvcResult = mockMvc.perform(get(location).accept(MediaType.APPLICATION_JSON)).andReturn();
    java.lang.String conversationAsString = getMvcResult.getResponse().getContentAsString();
    com.google.gson.Gson gson = gsonBuilder().create();
    com.github.maximilientyc.conversations.restadapter.Conversation conversation = gson.fromJson(conversationAsString, com.github.maximilientyc.conversations.restadapter.Conversation.class);
    return conversation;
}