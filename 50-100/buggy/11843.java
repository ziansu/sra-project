public void updateLockedLevels() {
    for (int i = 0; i < (buttons); i++) {
        levels[i] = new com.darkhouse.gdefence.Model.LevelButton(((firstButtonInt) + i));
        if (!(com.darkhouse.gdefence.GDefence.getInstance().user.getLevelAvailable(((firstButtonInt) + i)))) {
            levels[i].lock();
        }else {
            levels[i].unLock();
        }
    }
}