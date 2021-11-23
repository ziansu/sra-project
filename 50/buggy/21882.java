public void cancelBadge(org.kumoricon.site.badge.BadgeView view) {
    view.navigateTo(BadgeView.VIEW_NAME);
    view.closeBadgeEditWindow();
    view.clearSelection();
}