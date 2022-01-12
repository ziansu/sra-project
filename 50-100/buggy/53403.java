protected boolean tryAssigningTarget(com.esbjon.entities.Entity selectEntity, com.esbjon.entities.Entity targetEntity) {
    if (selectEntity.playerAssignTarget(targetEntity)) {
        targetEntity.setFlagMode(flagMode.TARGET);
        return true;
    }else {
        selectEntity.setSelected(false);
        targetEntity.setSelected(true);
        targetEntity.displayEntityBar();
    }
    return true;
}