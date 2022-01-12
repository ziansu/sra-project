@java.lang.Override
public void produceText(de.is2.ZZZZZnake.ZZZZZnake znake) {
    if ((znake.getLoopCount()) < 1) {
        startMessages(znake);
    }
    if ((znake.isVictory()) == true) {
        victory(znake);
    }
    if ((znake.isDead()) == true) {
        death(znake);
    }
    if (((znake.isRich()) == true) && ((znake.getLoopCountAfterGoldGet()) <= 1)) {
        goldGet(znake);
    }
}