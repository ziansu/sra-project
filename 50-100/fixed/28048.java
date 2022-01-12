public void putNextGeneration(java.util.Map<java.lang.String, java.lang.Integer> description, ru.ifmo.ctddev.sushencev.anteater.Individual[] ants, ru.ifmo.ctddev.sushencev.anteater.Individual[] antEaters) {
    try {
        oos.reset();
        renameAnts(ants);
        renameAnts(antEaters);
        oos.writeByte(ru.ifmo.ctddev.sushencev.anteater.Logger.GENERATION_BYTE);
        oos.writeObject(description);
        oos.writeObject(ants);
        oos.writeObject(antEaters);
    } catch (java.io.IOException e) {
        throw new java.lang.RuntimeException(e);
    }
}