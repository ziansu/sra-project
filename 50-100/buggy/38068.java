public boolean isInDomain(fr.xebia.skillz.model.Domain domain) {
    if (((this.domain) == null) && (domain.equals(Domain.none))) {
        return true;
    }
    return ((this.domain) != null) && (this.domain.equals(domain));
}