public void checkpoint() {
    if (stopped) {
        synchronized(this) {
            if (stopped) {
                ran = true;
                notify();
                try {
                    wait();
                } catch (java.lang.Exception e) {
                }
            }
        }
    }else {
        if (waiting) {
            synchronized(this) {
                if (waiting) {
                    ran = true;
                    notify();
                }
            }
        }
    }
}