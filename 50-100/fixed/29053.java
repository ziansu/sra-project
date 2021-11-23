@java.lang.Override
public void onEnable() {
    if (!(this.preEnable()))
        return ;
    
    dk.muj.derius.parkour.ParkourEngine.get().activate();
    dk.muj.derius.parkour.ParkourSkill.get().register();
    dk.muj.derius.parkour.JumpAbility.get().register();
    dk.muj.derius.parkour.RunAbility.get().register();
    dk.muj.derius.parkour.Fall.get().register();
    dk.muj.derius.parkour.SneakTask.get().activate();
    this.postEnable();
}