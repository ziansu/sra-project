private void check(jkind.engines.messages.ValidMessage vm) {
    for (java.lang.String property : vm.valid) {
        if (properties.remove(property)) {
            message = new jkind.engines.ivcs.messages.ConsistencyMessage(vm);
            check();
        }
    }
}