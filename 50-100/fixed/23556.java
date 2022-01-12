@org.junit.Test
public void testGetSegmentByValidId() throws gppmds.wikilegis.exception.SegmentException, org.json.JSONException {
    gppmds.wikilegis.controller.SegmentController segmentController = gppmds.wikilegis.controller.SegmentController.getInstance(context);
    segmentController.initControllerSegments();
    gppmds.wikilegis.model.Segment segment = segmentController.getSegmentById(3927, context);
    junit.framework.Assert.assertTrue(((segment.getId()) == 3927));
}