@org.junit.Test
public final void history() {
    final de.mq.portfolio.share.TimeCourse result = historyRestRepository.history(gatewayParameterAggregation);
    org.junit.Assert.assertTrue(((result.rates().size()) >= 250));
}