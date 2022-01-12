void addTransition(S q, A a, S p) {
    if (!(transitions.containsKey(q))) {
        transitions.put(q, new java.util.HashMap<>());
    }
    if (!(transitions.get(q).containsKey(a))) {
        transitions.get(q).put(a, new java.util.HashSet<S>());
    }
    transitions.get(q).get(a).add(p);
}