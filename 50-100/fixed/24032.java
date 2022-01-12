private java.util.function.UnaryOperator<org.springframework.web.server.ServerWebExchange> principal(java.lang.String userName) {
    return ( exchange) -> {
        java.security.Principal user = org.mockito.Mockito.mock(java.security.Principal.class);
        org.mockito.Mockito.when(user.getName()).thenReturn(userName);
        return exchange.mutate().principal(reactor.core.publisher.Mono.just(user)).build();
    };
}