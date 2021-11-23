protected void writeMemberFeature(org.deegree.feature.Feature member, org.deegree.gml.GMLStreamWriter gmlStream, javax.xml.stream.XMLStreamWriter xmlStream, org.deegree.gml.reference.GmlXlinkOptions resolveState, javax.xml.namespace.QName featureMemberEl, org.deegree.commons.tom.ows.Version requestVersion) throws javax.xml.stream.XMLStreamException, org.deegree.commons.ows.exception.OWSException, org.deegree.cs.exceptions.TransformationException, org.deegree.cs.exceptions.UnknownCRSException {
    if (member instanceof org.deegree.feature.FeatureTuple)
        writeFeatureTuple(((org.deegree.feature.FeatureTuple) (member)), gmlStream, xmlStream, resolveState, featureMemberEl, requestVersion);
    else
        writeFeature(member, gmlStream, xmlStream, resolveState, featureMemberEl, requestVersion);
    
}