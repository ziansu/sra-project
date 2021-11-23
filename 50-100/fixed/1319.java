protected void ensureAuthorized(app.models.Partner authenticatedPartner, java.lang.String path) {
    if ((path.startsWith("/platform/statistics")) && (!(authenticatedPartner.getBoolean("can_view_statistics")))) {
        notAuthorized(authenticatedPartner);
    }
    if ((path.startsWith("/platform/partners")) && (!(authenticatedPartner.getBoolean("can_manage_partners")))) {
        notAuthorized(authenticatedPartner);
    }
}