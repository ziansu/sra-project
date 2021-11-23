@org.junit.Test
public void testNextLevel() {
    monster.initMonsterList(5);
    testSpace.getMonsterList().clear();
    assertTrue(testSpace.monsterCheck());
}