private void getCustomerInfo() {
    rest = new se.zavann.gasellmvvm.GasellRest();
    listen = new se.zavann.gasellmvvm.Listeners.RestListener(this);
    rest.addObserver(listen);
    rest.getCustomerInfo(this.customerId);
}