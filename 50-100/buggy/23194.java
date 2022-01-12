@java.lang.Override
public void run() {
    try {
        while (true) {
            if ((cancelRequested) || (finished)) {
                zapoctak.Crawler.deadCount.incrementAndGet();
                break;
            }
            crawl();
            java.lang.Thread.sleep(100);
        } 
    } catch (java.io.IOException | zapoctak.InvalidOperationException | zapoctak.InvalidArgumentException e) {
    } catch (java.lang.InterruptedException ex) {
        java.util.logging.Logger.getLogger(zapoctak.Crawler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
}