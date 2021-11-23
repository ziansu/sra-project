public ua.romenskyi.webapp.shopping.domain.list.List toDomain() {
    ua.romenskyi.webapp.shopping.domain.list.List domainList = new ua.romenskyi.webapp.shopping.domain.list.List();
    domainList.setKey(getKey());
    domainList.setContent(getStringContent());
    domainList.setBought(isBought());
    domainList.setPublicList(isPublicList());
    return domainList;
}