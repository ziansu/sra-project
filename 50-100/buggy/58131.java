@org.junit.Test
public void TimerHasCorrectClass() {
    org.concordion.ext.timing.timeformatter.TimerSpecificationListener listener = new org.concordion.ext.timing.timeformatter.TimerSpecificationListener(new org.concordion.ext.timing.timeformatter.SimpleTimeFormatter());
    org.concordion.api.ResultSummary summary = new org.concordion.internal.SingleResultSummary(org.concordion.api.Result.SUCCESS);
    org.concordion.ext.timing.junit.timeformatter.ExampleEvent event = new org.concordion.ext.timing.junit.timeformatter.ExampleEvent("Test", new org.concordion.api.Element("div"), summary);
    listener.beforeExample(event);
    listener.afterExample(event);
    org.concordion.api.Element timingContainer = event.getElement().getFirstDescendantNamed("div");
    org.junit.Assert.assertEquals("Container's class is 'time-fig'", "time-fig", timingContainer.getAttributeValue("class"));
}