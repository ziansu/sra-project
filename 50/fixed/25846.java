public boolean isCancelled() {
    for (com.microsoft.rest.ServiceCall<?> call : this.serviceCalls) {
        if (!(call.isCancelled())) {
            return false;
        }
    }
    return true;
}