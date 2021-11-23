public void setAsPathSegments(java.util.List<es.tid.bgp.bgp4.update.fields.pathAttributes.AS_Path_Segment> asPathSegments) {
    this.asPathSegments = asPathSegments;
    for (es.tid.bgp.bgp4.update.fields.pathAttributes.AS_Path_Segment asPathSegment : asPathSegments)
        length += asPathSegment.getLength();
    
}