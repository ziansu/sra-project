@java.lang.Override
public vg.civcraft.mc.prisonpearl.PrisonPearl newPearl(java.lang.String imprisonedName, java.util.UUID imprisonedId, org.bukkit.entity.Player imprisoner) {
    java.util.Random rand = new java.util.Random();
    vg.civcraft.mc.prisonpearl.PrisonPearl pp = new vg.civcraft.mc.prisonpearl.PrisonPearl(imprisonedName, imprisonedId, imprisoner, rand.nextInt(1000000000));
    addPearl(pp);
    pp.setHolder(imprisoner.getLocation());
    pp.markMove();
    return pp;
}