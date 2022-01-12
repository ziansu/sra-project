@org.junit.Test
public void testSentenceWithCommas() throws cc.redpen.RedPenException {
    cc.redpen.model.Document document = prepareSimpleDocument("There is no real path, so first follow the line of the foot of the rocks past Kawa, then cut straight up to the next level of slabs.");
    cc.redpen.RedPen redPen = new cc.redpen.RedPen(config);
    java.util.Map<cc.redpen.model.Document, java.util.List<cc.redpen.validator.ValidationError>> errors = redPen.validate(java.util.Collections.singletonList(document));
    org.junit.Assert.assertEquals(1, errors.get(document).size());
}