void addTransition(S q, A a, S p) {
    if (!(transitions.containsKey(q))) {
        transitions.put(q, new java.util.HashMap<>());
    }
    transitions.get(q).put(a, p);
}