protected void writeBegin(org.n52.shetland.ogc.gml.time.TimePeriod tp) throws javax.xml.stream.XMLStreamException, org.n52.svalbard.encode.exception.EncodingException {
    if (tp.isSetStartIndeterminateValue()) {
        empty(GmlConstants.QN_BEGIN_POSITION_32);
        attr(GmlConstants.AN_INDETERMINATE_POSITION, tp.getStartIndet().getValue());
    }else
        if (tp.isSetStart()) {
            start(GmlConstants.QN_BEGIN_POSITION_32);
            writeTimeString(tp.getStart(), tp.getTimeFormat());
        }else {
            empty(GmlConstants.QN_BEGIN_POSITION_32);
        }
    
    end(GmlConstants.QN_BEGIN_POSITION_32);
}