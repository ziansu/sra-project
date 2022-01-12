public client.ClientState handleState(java.lang.String input, client.ClientState state) {
    if ("BYE".equalsIgnoreCase(input))
        return ClientState.QUIT;
    
    if ((state.equals(ClientState.ADD_IDEA)) || (input.equalsIgnoreCase("list")))
        return state;
    
    return client.ClientState.fromString(input.toUpperCase());
}