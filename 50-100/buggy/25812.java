@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void difficultyTest() {
    assertEquals((-1), Difficulty.HARDCORE.asByte());
    assertEquals(0, Difficulty.PEACEFUL.asByte());
    assertEquals(1, Difficulty.EASY.asByte());
    assertEquals(2, Difficulty.NORMAL.asByte());
    assertEquals(3, Difficulty.HARD.asByte());
    assertEquals(Difficulty.HARD, net.tridentsdk.world.opt.Difficulty.from(3));
    net.tridentsdk.world.opt.Difficulty.from(30);
}