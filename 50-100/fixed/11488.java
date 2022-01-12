private void addSharedLink(models.SharedLink link, boolean newActivity) {
    if (!(this.sharedLinks.contains(link))) {
        link.member = this;
        link.ordernum = this.sharedLinks.size();
        this.sharedLinks.add(link);
        if (newActivity && ((this.id) != null)) {
            link.save();
            new models.SharedLinkActivity(link).save();
        }
    }
}