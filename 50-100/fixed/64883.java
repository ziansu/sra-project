private void fluctuateNetworkTraffic() {
    for (java.util.Map.Entry<vm.VM, java.lang.Integer> entry : connectedVMs.entrySet()) {
        entry.setValue(this.networkTrafficGenerator.generate(entry.getValue(), entry.getKey().getMaxBandwidth()));
    }
}