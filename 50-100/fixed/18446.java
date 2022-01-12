@java.lang.Override
public void run() {
    boolean offered = false;
    do {
        if (lock.tryLock()) {
            try {
                offered = requests.offer(req);
                if (!offered) {
                    try {
                        doPost();
                    } catch (java.io.IOException e) {
                        org.apache.log4j.helpers.LogLog.error("WeblogsAppender -- Stackrace", e);
                    }
                }
            } finally {
                lock.unlock();
            }
        }
        if (!offered) {
            offered = requests.offer(req);
        }
    } while (!offered );
}