private void fluctuateNetworkTraffic() {
    for (java.util.Map.Entry<vm.VM, java.lang.Integer> entry : connectedVMs.entrySet()) {
        connectedVMs.put(entry.getKey(), this.networkTrafficGenerator.generate(entry.getValue(), entry.getKey().getMaxBandwidth()));
    }
}