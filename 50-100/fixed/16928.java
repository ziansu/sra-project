private void addValueAtEmptyPosition(final java.util.Map<java.lang.Integer, java.lang.Object> args, final java.lang.Object value) {
    for (int i = 0; i < ((args.size()) + 1); i++) {
        if (!(args.containsKey(i))) {
            args.put(i, value);
            break;
        }
    }
}