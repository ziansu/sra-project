@java.lang.Override
public void run() {
    for (int i = 0; i < (tList.size()); i++) {
        if ((tList.get(i).getTerrain()) == (ROAD)) {
            tList.get(i).startThread();
            try {
                java.lang.Thread.sleep(100);
            } catch (java.lang.InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}