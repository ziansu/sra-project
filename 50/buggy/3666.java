public static <T> com.aol.cyclops.reactor.hkt.FluxKind<T> widen(final com.aol.cyclops.reactor.hkt.Flux<T> completableFlux) {
    return new com.aol.cyclops.reactor.hkt.FluxKind(completableFlux);
}