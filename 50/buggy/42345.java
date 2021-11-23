public void cancel() {
    for (com.microsoft.rest.ServiceCall<?> call : this.serviceCalls) {
        call.cancel();
    }
}