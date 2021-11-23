@java.lang.Override
public boolean checkHasMaterials() {
    if (mode.equals(com.github.igotyou.FactoryMod.Factorys.Compactor.CompactorMode.REPAIR)) {
        return getAllInputs().allIn(getInventory());
    }else {
        if (getInputs().isEmpty()) {
            return false;
        }else {
            return true;
        }
    }
}