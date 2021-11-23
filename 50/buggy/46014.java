public void dispose() {
    try {
        book.close();
    } catch (java.io.IOException e) {
    } finally {
        super.dispose();
    }
}