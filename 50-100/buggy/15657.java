public void lockSet(com.embedsky.httpUtils.lockStruct[] lockstruct) {
    lock_val = new java.lang.String();
    if (!(warntype.equals("1"))) {
        for (int i = 0; i < (lockstruct.length); i++) {
            lock_val += (lockstruct[i].getlockStatus()) + "-";
        }
        lock_val = lock_val.substring(0, ((lock_val.length()) - 1));
    }
}