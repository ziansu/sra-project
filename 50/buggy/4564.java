private boolean isIdSet(edu.asu.qstore4s.domain.elements.impl.Element element) {
    return ((element.getId()) != null) && (element.getId().trim().isEmpty());
}