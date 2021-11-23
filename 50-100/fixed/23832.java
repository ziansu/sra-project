public void badgeSelected(org.kumoricon.site.badge.BadgeView view, org.kumoricon.model.badge.Badge badge) {
    if (badge != null) {
        org.kumoricon.site.badge.BadgePresenter.log.info("{} viewed badge {}", view.getCurrentUser(), badge);
        view.navigateTo((((BadgeView.VIEW_NAME) + "/") + (badge.getId().toString())));
        view.showBadge(badge);
    }
}