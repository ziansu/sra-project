public void dispose() {
    try {
        fieldNames.clear();
        index.close();
        writer.close();
        indexAdapter.dispose();
    } catch (java.io.IOException e) {
        e.printStackTrace();
        throw new java.lang.RuntimeException(e);
    }
}