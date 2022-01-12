public void setMachineLevel(recipe.MachineClass mc, java.lang.Integer level) throws recipe.MachineLevelOutOfBoundsException {
    if (!(mc.hasLevel(level))) {
        throw new recipe.MachineLevelOutOfBoundsException(mc, level);
    }
    machineLevels.put(mc, level);
}