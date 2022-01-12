private void checkTerminated(int checkCount) {
    if (checkCount <= 0)
        return ;
    
    java.lang.Thread t = new java.lang.Thread() {
        public void run() {
            if (((executor) == null) || (executor.isTerminated())) {
                state = com.bryllyant.kona.thread.KExecutor.State.TERMINATED;
                com.bryllyant.kona.thread.KExecutor.logger.debug(("KExecutor: internal executor has terminated:\n" + (stats)));
            }else {
                com.bryllyant.kona.util.KSystemUtil.sleep(1000L);
                checkTerminated((checkCount - 1));
            }
        }
    };
    t.start();
}