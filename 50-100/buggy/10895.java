public void addJet(java.lang.String model, double speed, double range, int capacity) {
    week2.Jets[] addJets = new week2.Jets[(jets.length) + 1];
    for (int i = 0; i < ((addJets.length) - 1); i++) {
        addJets[i] = jets[i];
    }
    addJets[jets.length] = new week2.Jets(model, speed, range, capacity);
    jets = addJets;
    printJets(jets);
}