@org.junit.Test
public void HeroAttackTest() {
    battlequest.iv.Hero mew = new battlequest.iv.Hero(250, 300, 30, 50, 5000);
    battlequest.iv.Enemy mewTwo = new battlequest.iv.Enemy(275, 250, 50, 75, 1250);
    mew.attack(mewTwo);
    assertEquals((5000 - 480), mew.getHp());
}