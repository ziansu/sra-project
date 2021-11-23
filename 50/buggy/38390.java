private void getMilk(java.lang.String arrow) {
    int newMilk;
    checkHand(arrow);
    newMilk = currentCow.giveMilk();
    milk += newMilk;
}