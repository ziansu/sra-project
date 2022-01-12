private void addSharedLink(models.SharedLink link, boolean newActivity) {
    if (!(this.sharedLinks.contains(link))) {
        link.member = this;
        link.ordernum = this.sharedLinks.size();
        this.sharedLinks.add(link);
        link.save();
        if (newActivity) {
            new models.SharedLinkActivity(link).save();
        }
    }
}