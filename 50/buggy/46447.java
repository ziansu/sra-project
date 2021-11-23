@org.junit.Test
public void hashCodeInitializedStateTest() {
    unitTests.State state = new unitTests.State(Units, EnemyArmyPosition, EnemyBuildingInfo, EnemyArmyInfo, EnemyArmyCount, Minerals, Gas);
    java.lang.System.out.println(state.toString());
    assertEquals(state.hashCode(), 834821160);
}