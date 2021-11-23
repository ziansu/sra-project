@org.junit.Test
public void testNextLevel() {
    testSpace.initMonsterList(5);
    testSpace.getMonsterList().clear();
    assertTrue(testSpace.monsterCheck());
}