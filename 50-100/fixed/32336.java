@java.lang.Override
public void update() {
    if (((LD39.s.gs.money) >= 250) && ((power) < ((getMaxPower()) - 1))) {
        LD39.s.gs.money -= getFuelCost();
        hasFuel = true;
        isPowered = 1;
    }else {
        hasFuel = false;
        isPowered = 0;
    }
    super.update();
}