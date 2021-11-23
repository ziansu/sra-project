@javax.persistence.Transient
public boolean isAllowRefresh() {
    return ((grantTypes) != null) && (getAuthorizedGrantTypes().contains("refresh_token"));
}