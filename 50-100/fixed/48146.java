private org.w3c.dom.Element addGroupWrapper(org.w3c.dom.Element parent, org.smap.sdal.model.Question q, boolean repeat, org.smap.sdal.model.Form form) {
    org.w3c.dom.Element groupElement = outputDoc.createElement("section");
    parent.appendChild(groupElement);
    setQuestionClass(q, groupElement);
    if (!repeat) {
        groupElement.setAttribute("name", paths.get(getRefName(q.name, form)));
    }
    addGroupTitle(groupElement, q, form);
    return groupElement;
}