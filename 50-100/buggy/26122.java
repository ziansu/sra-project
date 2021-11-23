public void previousLink() {
    if (((links.getLinks()) == null) || (links.getLinks().isEmpty())) {
        return ;
    }
    if ((currentLink) == 0) {
        currentLink = (links.getLinks().size()) - 1;
    }else {
        (currentLink)--;
    }
    com.tddp2.grupo2.linkup.model.Profile profile = links.getLinks().get(currentLink);
    view.showLink(profile);
}