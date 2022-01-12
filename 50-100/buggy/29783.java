public boolean processTransaction(int src, int dst, int amount) {
    if (this.timeRuleVerification(src, dst)) {
        mt.edu.um.b_d_app.AtomicTransaction new_t = new mt.edu.um.b_d_app.AtomicTransaction(src, dst, amount, database);
        boolean flag = new_t.process();
        if (flag) {
            this.setNumberTransactionsProcessed();
            this.updateActive(src, dst);
        }
        return flag;
    }else {
        return false;
    }
}