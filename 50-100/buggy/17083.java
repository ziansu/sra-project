public void mergeUsedStates(java.util.List<java.lang.String> s) {
    for (int i = 0; i < (usedStates.size()); i++) {
        if ((usedStates.get(i).isEmpty()) && (!(s.get(i).isEmpty()))) {
            if (!(usedStates.contains(s.get(i)))) {
                usedStates.add(i, s.get(i));
            }
        }
    }
}