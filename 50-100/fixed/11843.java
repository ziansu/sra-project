public void updateLockedLevels() {
    for (int i = 0; i < (buttons); i++) {
        if (com.darkhouse.gdefence.GDefence.getInstance().user.getLevelAvailable(((firstButtonInt) + i))) {
            levels[i].unLock();
        }else {
            levels[i].lock();
        }
    }
}