@java.lang.Override
public void process(net.minecraft.entity.player.EntityPlayer player, net.minecraftforge.fml.relauncher.Side side) {
    final uk.co.wehavecookies56.kizunacraft.Kiznaivers.IKiznaivers kiznaiver = player.getCapability(Kiznaivers.KIZNAIVERS, null);
    kiznaiver.setHasImplant(implant);
    for (int i = 0; i < (kiznaivers.size()); i++) {
        kiznaiver.bindKiznaiver(kiznaivers.get(i));
    }
    java.lang.System.out.println(side);
    java.lang.System.out.println(implant);
}