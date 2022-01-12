@java.lang.Override
public boolean checkHasMaterials() {
    if (mode.equals(com.github.igotyou.FactoryMod.Factorys.Compactor.CompactorMode.REPAIR)) {
        return super.checkHasMaterials();
    }else {
        return (super.checkHasMaterials()) && (!(getInputs().isEmpty()));
    }
}