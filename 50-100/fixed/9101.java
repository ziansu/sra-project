public void run() throws java.io.IOException {
    refPanel.repaint();
    if ((this.state) == (state.OrderSUMMARY)) {
        this.customer.addTransaction(this.transaction.getTransactionNum());
        this.customer.write();
        this.transaction.write();
        if (this.writeToGlobalReciept) {
            this.writeReceipt();
            this.writeToGlobalReciept = false;
        }
    }
}