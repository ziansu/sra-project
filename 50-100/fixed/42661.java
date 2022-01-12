@java.lang.Override
public void run() {
    for (int i = 0; i < (tList.size()); i++) {
        if ((tList.get(i).getTerrain()) == (ROAD)) {
            tList.get(i).startThread();
        }
    }
}