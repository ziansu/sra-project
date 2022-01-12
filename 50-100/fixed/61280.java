static void write(epd.model.EpdDataSet ds, org.openlca.ilcd.commons.Other other, org.w3c.dom.Document doc) {
    if (epd.io.conversion.Util.hasNull(ds, other, doc))
        return ;
    
    epd.io.conversion.Util.clear(other, "safetyMargins");
    epd.model.SafetyMargins m = ds.safetyMargins;
    if ((m == null) || (((m.margins) == null) && (m.description.isEmpty())))
        return ;
    
    org.w3c.dom.Element element = epd.io.conversion.SafetyMarginsConverter.toElement(m, doc);
    other.any.add(element);
}