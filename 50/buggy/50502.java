protected void postCreateView(android.app.Dialog view, android.os.Bundle savedInstanceState) {
    if ((presenter) == null) {
        throw new java.lang.RuntimeException("Failed to create presenter for fragment");
    }
    presenter.onViewCreated(view);
}