public java.util.Set<S> simulate(S q, java.util.List<A> w) {
    java.util.HashSet<S> result = new java.util.HashSet<>();
    simulate(q, result, w);
    return result;
}