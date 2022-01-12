public int getState() {
    if ((mPrintJobs.size()) > 0) {
        return mPrintJobs.get(0).getInfo().getState();
    }else {
        return -1;
    }
}