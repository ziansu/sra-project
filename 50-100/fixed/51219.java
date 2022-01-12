@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((this) == o)
        return true;
    
    if (!(o instanceof com.niat.cms.domain.Tag))
        return false;
    
    com.niat.cms.domain.Tag tag = ((com.niat.cms.domain.Tag) (o));
    if (((text) == null) || ((tag.text) == null)) {
        return false;
    }
    if (!(text.equals(tag.text)))
        return false;
    
    return true;
}