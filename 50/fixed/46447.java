@org.junit.Test
public void hashCodeInitializedStateTest() {
    unitTests.State state = new unitTests.State(Units, EnemyArmyPosition, EnemyBuildingInfo, EnemyArmyInfo, EnemyArmyCount, Minerals, Gas);
    assertEquals(state.hashCode(), 834821160);
}