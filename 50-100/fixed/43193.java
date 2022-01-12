public void nextLink() {
    if (((links) == null) || (links.getLinks().isEmpty())) {
        return ;
    }
    if ((currentLink) == ((links.getLinks().size()) - 1)) {
        currentLink = 0;
    }else {
        (currentLink)++;
    }
    com.tddp2.grupo2.linkup.model.Profile profile = links.getLinks().get(currentLink);
    view.showLink(profile);
}