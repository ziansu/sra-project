public boolean isCancelled() {
    for (com.microsoft.rest.ServiceCall<?> call : this.serviceCalls) {
        if (!(call.isCanceled())) {
            return false;
        }
    }
    return true;
}