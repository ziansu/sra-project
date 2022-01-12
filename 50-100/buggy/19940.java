private com.temenos.interaction.core.command.CommandController mockCommandController(com.temenos.interaction.core.command.InteractionCommand mockCommand) {
    com.temenos.interaction.core.command.CommandController cc = org.mockito.Mockito.mock(com.temenos.interaction.core.command.CommandController.class);
    org.mockito.Mockito.when(cc.fetchCommand("DO")).thenReturn(mockCommand);
    org.mockito.Mockito.when(cc.fetchCommand("GET")).thenReturn(mockCommand);
    org.mockito.Mockito.when(cc.fetchCommand("POST")).thenReturn(mockCommand);
    return cc;
}