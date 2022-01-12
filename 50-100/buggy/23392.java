@java.lang.Override
public void entityInit() {
    super.entityInit();
    java.lang.System.out.println("Entity Big Cat entityInit");
    dataManager.register(com.blogspot.jabelarminecraft.wildanimals.entities.bigcats.EntityBigCat.SCALE_FACTOR, 1.2F);
    dataManager.register(com.blogspot.jabelarminecraft.wildanimals.entities.bigcats.EntityBigCat.IS_INTERESTED, false);
    dataManager.register(com.blogspot.jabelarminecraft.wildanimals.entities.bigcats.EntityBigCat.IS_ANGRY, false);
    dataManager.register(com.blogspot.jabelarminecraft.wildanimals.entities.bigcats.EntityBigCat.IS_SITTING, false);
    dataManager.register(com.blogspot.jabelarminecraft.wildanimals.entities.bigcats.EntityBigCat.COLLAR_COLOR, java.lang.Integer.valueOf(EnumDyeColor.RED.getDyeDamage()));
}