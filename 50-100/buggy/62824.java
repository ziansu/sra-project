public void run() {
    if (barrier != null)
        barrier.await();
    
    if ((bf) != null)
        bf.close();
    
    if ((summary) != null)
        summary.close();
    
    if ((runOnClose) != null)
        runOnClose.run();
    
    dfile.close();
    if ((ifile) != null)
        ifile.close();
    
    typeRef.release();
}