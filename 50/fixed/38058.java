@java.lang.Override
public void run() {
    while (started) {
        try {
            java.lang.Thread.sleep(delay);
            if (!(started))
                return ;
            
            spawnFood();
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    } 
}