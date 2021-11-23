private void updateUniversalChoiceSetCosts() {
    for (java.util.HashMap<java.lang.Integer, network.OD> m : ods.values()) {
        for (network.OD od : m.values()) {
            for (network.Path path : od.R) {
                path.updateCost();
            }
        }
    }
}