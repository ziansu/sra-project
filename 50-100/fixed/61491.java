public void run() throws java.io.IOException {
    refPanel.repaint();
    if ((this.state) == (state.OrderSUMMARY)) {
        this.customer.write(this.transaction.getTransactionNum());
        this.transaction.write();
        if (this.writeToGlobalReciept) {
            this.writeReceipt();
            this.writeToGlobalReciept = false;
        }
    }
}