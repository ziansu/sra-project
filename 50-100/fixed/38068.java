public boolean isInDomain(fr.xebia.skillz.model.Domain domain) {
    if (((this.domain) == null) && (domain.getId().equals(Domain.none.getId()))) {
        return true;
    }
    return ((this.domain) != null) && (this.domain.getId().equals(domain.getId()));
}