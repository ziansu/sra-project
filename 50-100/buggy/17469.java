public void run() {
    if (barrier != null)
        barrier.await();
    
    bf.close();
    dfile.close();
    ifile.close();
    if ((summary) != null)
        summary.close();
    
    if ((runOnClose) != null)
        runOnClose.run();
    
    typeRef.release();
}