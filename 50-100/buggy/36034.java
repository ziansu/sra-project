private boolean changefulltext(com.silicolife.textmining.core.interfaces.core.document.IPublication publication, com.silicolife.textmining.core.interfaces.core.document.IPublication pub) {
    if (((publication.getFullTextContent()) == null) || (publication.getFullTextContent().isEmpty())) {
        return false;
    }
    if (pub != null) {
        if (((pub.getFullTextContent()) != null) && (!(pub.getFullTextContent().isEmpty()))) {
            return false;
        }
    }
    return true;
}