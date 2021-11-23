@mockit.Test
public void recordDifferentResultsForInstancesCreatedWithDifferentConstructors(@mockit.Mocked
final mockit.MockingNewInstancesWithVaryingBehaviorTest.Collaborator anyCol) {
    new mockit.Expectations() {
        {
            anyCol.getValue();
            result = 1;
            mockit.MockingNewInstancesWithVaryingBehaviorTest.Collaborator col2 = new mockit.MockingNewInstancesWithVaryingBehaviorTest.Collaborator(anyInt);
            col2.getValue();
            result = 2;
        }
    };
    int valueFromRecordedConstructor = new mockit.MockingNewInstancesWithVaryingBehaviorTest.Collaborator(10).getValue();
    int valueFromAnyOtherConstructor = new mockit.MockingNewInstancesWithVaryingBehaviorTest.Collaborator().getValue();
    assertEquals(2, valueFromRecordedConstructor);
    assertEquals(1, valueFromAnyOtherConstructor);
}