@org.junit.Test
public void testGetSegmentByInvalidId() throws gppmds.wikilegis.exception.SegmentException, org.json.JSONException {
    gppmds.wikilegis.controller.SegmentController segmentController = gppmds.wikilegis.controller.SegmentController.getInstance(context);
    segmentController.initControllerSegments();
    gppmds.wikilegis.model.Segment segment = segmentController.getSegmentById(0, context);
    junit.framework.Assert.assertNull(segment);
}