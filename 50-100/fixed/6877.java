public static com.packt.service.BookService getInstance() {
    java.util.ServiceLoader<com.packt.spi.BookServiceProvider> sl = java.util.ServiceLoader.load(com.packt.spi.BookServiceProvider.class);
    java.util.Iterator<com.packt.spi.BookServiceProvider> iter = sl.iterator();
    if (!(iter.hasNext()))
        throw new java.lang.RuntimeException("No service providers found!");
    
    com.packt.spi.BookServiceProvider provider = null;
    while (iter.hasNext()) {
        provider = iter.next();
        java.lang.System.out.println(provider.getClass());
    } 
    return provider.getBookService();
}