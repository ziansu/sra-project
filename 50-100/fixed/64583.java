@org.junit.Test
public void testEvaluateWithNulls() {
    org.gbif.dwc.terms.Term[] columnMapping = new org.gbif.dwc.terms.Term[]{ org.gbif.dwc.terms.DwcTerm.occurrenceID , org.gbif.dwc.terms.DwcTerm.eventDate , org.gbif.dwc.terms.DcTerm.modified };
    org.gbif.validation.evaluator.record.OccurrenceInterpretationEvaluator evaluator = new org.gbif.validation.evaluator.record.OccurrenceInterpretationEvaluator(org.mockito.Mockito.mock(org.gbif.occurrence.processor.interpreting.OccurrenceInterpreter.class), columnMapping, null);
    org.junit.Assert.assertNull(evaluator.evaluate(null, null));
}