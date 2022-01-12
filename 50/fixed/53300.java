void submit() {
    try {
        touchFiles();
    } catch (java.lang.Exception e) {
        m_context.error(e);
    }
}