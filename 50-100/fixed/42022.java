@util.annotations.Row(value = 0)
@util.annotations.Column(value = 3)
@util.annotations.ComponentWidth(value = 100)
public void play() {
    if (!(running)) {
        running = true;
        new java.lang.Thread(new java.lang.Runnable() {
            public void run() {
                while (running) {
                    forward();
                    if (!(running)) {
                        return ;
                    }
                    try {
                        java.lang.Thread.sleep(1000);
                    } catch (java.lang.InterruptedException e) {
                        e.printStackTrace();
                    }
                } 
            }
        }).start();
    }
}