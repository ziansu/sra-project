private void updateName(java.lang.String name) {
    if ((this.getEntityPet()) == null) {
        return ;
    }
    if (this.getEntityPet().hasInititiated()) {
        this.getEntityPet().updatePosition();
    }
    com.dsh105.echopet.compat.api.entity.type.nms.IEntityHumanPet human = ((com.dsh105.echopet.compat.api.entity.type.nms.IEntityHumanPet) (this.getEntityPet()));
    if ((human.getGameProfile()) != null) {
        human.setGameProfile(com.dsh105.echopet.compat.api.util.wrapper.WrappedGameProfile.getNewProfile(human.getGameProfile(), name));
    }
}