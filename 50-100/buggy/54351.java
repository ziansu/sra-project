@java.lang.Override
public com.effektif.workflow.api.model.RelativeTime readRelativeTimeEffektif(java.lang.String localPart) {
    com.effektif.workflow.api.model.RelativeTime relativeTime = null;
    startExtensionElements();
    com.effektif.workflow.api.bpmn.XmlElement element = ((currentXml) != null) ? currentXml.removeElement(com.effektif.workflow.impl.bpmn.EFFEKTIF_URI, localPart) : null;
    if (element != null) {
        startElement(element);
        relativeTime = com.effektif.workflow.api.model.RelativeTime.readBpmnPolymorphic(this);
        endElement();
    }
    endExtensionElements();
    return relativeTime;
}