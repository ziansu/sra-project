protected java.util.List<T> createProposals() {
    java.lang.System.out.println((("Auto-complete: >" + (buffer.getValue())) + "<"));
    return callback.getProposals(buffer.getValue());
}