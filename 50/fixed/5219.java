@java.lang.Override
public void run() {
    playerMap.remove(p.getUniqueId());
    if ((p != null) && (p.isOnline())) {
        removeEntitys(p, cubeIds);
    }
}