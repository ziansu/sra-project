public boolean applyTop(int id) {
    boolean bool = false;
    int applyTotal = newsDao.applyTotalTop();
    if (applyTotal <= 5) {
        int count = newsDao.applyTop(id);
        if (count > 0) {
            bool = true;
        }
    }
    return bool;
}