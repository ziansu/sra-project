public client.ClientState handleState(java.lang.String input, client.ClientState state) {
    if ("BYE".equalsIgnoreCase(input))
        return ClientState.QUIT;
    
    if ((ClientState.ADD_IDEA.equals(state)) || ("list".equalsIgnoreCase(input)))
        return state;
    
    return client.ClientState.fromString(input.toUpperCase());
}