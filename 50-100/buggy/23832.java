public void badgeSelected(org.kumoricon.site.badge.BadgeView view, org.kumoricon.model.badge.Badge badge) {
    if (badge != null) {
        org.kumoricon.site.badge.BadgePresenter.log.info("{} viewed badge {}", view.getCurrentUser(), badge);
        view.navigateTo((((BadgeView.VIEW_NAME) + "/") + (badge.getId().toString())));
        view.showBadge(badge);
    }else {
        org.kumoricon.site.badge.BadgePresenter.log.error("{} tried to view a badge, but null was passed to BadgePresenter.badgeSelected()");
    }
}