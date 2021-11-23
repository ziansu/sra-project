protected void writeObservedProperty(org.n52.shetland.ogc.sos.gda.GetDataAvailabilityResponse.DataAvailability da) throws javax.xml.stream.XMLStreamException {
    empty(GetDataAvailabilityConstants.GDA_OBSERVED_PROPERTY);
    attr(GetDataAvailabilityConstants.XLINK_HREF, da.getObservedProperty().getHref());
    if (da.getObservedProperty().isSetTitle()) {
        attr(GetDataAvailabilityConstants.XLINK_TITLE, da.getObservedProperty().getTitle());
    }else {
        attr(GetDataAvailabilityConstants.XLINK_TITLE, da.getObservedProperty().getTitleOrFromHref());
    }
    end(GetDataAvailabilityConstants.GDA_OBSERVED_PROPERTY);
}