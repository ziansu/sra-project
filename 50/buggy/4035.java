public static <T> com.aol.cyclops.reactor.hkt.FluxKind<T> widen(final org.reactivestreams.Publisher<T> completableFlux) {
    return new com.aol.cyclops.reactor.hkt.FluxKind(com.aol.cyclops.reactor.hkt.Flux.from(completableFlux));
}