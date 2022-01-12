public void dispose() {
    try {
        fieldNames.clear();
        writer.close();
        index.close();
        indexAdapter.dispose();
    } catch (java.io.IOException e) {
        e.printStackTrace();
        throw new java.lang.RuntimeException(e);
    }
}