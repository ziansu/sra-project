@java.lang.Override
void setCallback(io.techery.janet.Callback callback) {
    super.setCallback(null);
    for (io.techery.janet.ProxyService.ServiceRuleTuple tuple : entries) {
        tuple.service.setCallback(callback);
    }
}