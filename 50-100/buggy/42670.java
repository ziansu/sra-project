public void open() {
    synchronized(lock) {
        if (!(isOpen())) {
            if ((directorySupplier) == null) {
                throw new java.lang.IllegalStateException("Could not open index as directory supplier is not provided");
            }
            directory = directorySupplier.get();
            owningDirectory = true;
        }
    }
}