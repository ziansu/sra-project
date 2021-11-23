@java.lang.Override
public double getMaxInput() {
    if (((hasStartedCrafting) && ((currentRecipe) != null)) && ((currentRecipe.getEuTick()) > 0)) {
        return 0;
    }
    return 8192;
}