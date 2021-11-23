@java.lang.Override
public gov.nist.healthcare.tools.hl7.v2.igamt.lite.service.serialization.impl.SerializableSection serializeSegment(gov.nist.healthcare.tools.hl7.v2.igamt.lite.service.serialization.impl.SegmentLink segmentLink, java.lang.String prefix, java.lang.Integer position, java.lang.Integer headerLevel, gov.nist.healthcare.tools.hl7.v2.igamt.lite.service.serialization.impl.UsageConfig segmentUsageConfig) {
    gov.nist.healthcare.tools.hl7.v2.igamt.lite.service.serialization.impl.Segment segment = segmentService.findById(segmentLink.getId());
    return this.serializeSegment(segment, segmentLink, prefix, position, headerLevel, segmentUsageConfig, null, null);
}