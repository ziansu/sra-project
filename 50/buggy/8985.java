@java.lang.Override
public void doSumWeek(int timeid) {
    assessDao.weekjisuanpianqu();
    assessDao.weekSumWuye(timeid);
}