public void run() {
    if (barrier != null)
        barrier.await();
    
    bf.close();
    if ((summary) != null)
        summary.close();
    
    if ((runOnClose) != null)
        runOnClose.run();
    
    dfile.close();
    ifile.close();
    typeRef.release();
}