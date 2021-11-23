@java.lang.Override
public void fight(Damage damage) {
    super.fight(damage);
    BaseActor defender = ((BaseActor) (damage.getDefender()));
    if (defender instanceof Goal) {
        java.lang.System.out.println("--- GOAL ---");
        ((PlayWorld) (getWorld())).win();
    }else
        if (defender instanceof Block) {
            turn(180);
        }
    
}