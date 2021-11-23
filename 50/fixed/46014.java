public void dispose() {
    try {
        if (null != (book))
            book.close();
        
    } catch (java.io.IOException e) {
    } finally {
        super.dispose();
    }
}