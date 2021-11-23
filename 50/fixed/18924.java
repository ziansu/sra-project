@java.lang.Override
public nu.xom.Element serializeElement() {
    for (gov.nist.healthcare.tools.hl7.v2.igamt.lite.domain.serialization.SerializableSection serializableSection : serializableSectionList) {
        if (serializableSection != null) {
            sectionElement.appendChild(serializableSection.serializeElement());
        }
    }
    return sectionElement;
}