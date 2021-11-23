@java.lang.Override
public nu.xom.Document serializeIGDocumentToDoc(gov.nist.healthcare.tools.hl7.v2.igamt.lite.domain.IGDocument igdoc) {
    gov.nist.healthcare.tools.hl7.v2.igamt.lite.service.impl.Element e = new gov.nist.healthcare.tools.hl7.v2.igamt.lite.service.impl.Element("ConformanceProfile");
    gov.nist.healthcare.tools.hl7.v2.igamt.lite.service.impl.Element metadata = this.serializeIGDocumentMetadataToDoc(igdoc);
    gov.nist.healthcare.tools.hl7.v2.igamt.lite.service.impl.Element rootSections = this.serializeIGDocumentSectionsToDoc(igdoc);
    gov.nist.healthcare.tools.hl7.v2.igamt.lite.service.impl.Element profileSections = this.serializeProfileToDoc(igdoc);
    nu.xom.Document doc = new nu.xom.Document(e);
    e.appendChild(metadata);
    e.appendChild(rootSections);
    e.appendChild(profileSections);
    return doc;
}