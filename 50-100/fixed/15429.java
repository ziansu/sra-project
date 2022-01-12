@org.junit.Test
public void testStepperAdapter() {
    io.github.wzieba.vericco.Model.Feature[] features = getTestData();
    io.github.wzieba.vericco.Adapter.StepperAdapter stepperAdapter = new io.github.wzieba.vericco.Adapter.StepperAdapter(context, fragmentActivity.getSupportFragmentManager(), features);
    testCreatingSteps(features, stepperAdapter);
    testGettingViewModels(features, stepperAdapter);
    testItemCounts(features, stepperAdapter);
}