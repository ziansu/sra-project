private void remove_np_name(java.lang.String given) {
    for (int i = 0; i < (not_patterns.size()); i++) {
        if ((not_patterns.get(i)) == given) {
            not_patterns.remove(i);
        }
    }
}