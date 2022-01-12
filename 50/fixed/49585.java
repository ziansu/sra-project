@java.lang.Override
public int gainmojo(int x) {
    return ((int) (x * (1.0F - (nightgames.global.Global.getPlayer().getAddiction(AddictionType.ZEAL).getMagnitude()))));
}