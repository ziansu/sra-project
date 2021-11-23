private void updatePmName(com.dataart.rmvote.model.UserPrincipal principal, java.lang.String newPmName) {
    if ((newPmName != null) && (!(newPmName.equals(principal.getPmName())))) {
        log.info("Updating user {} with new PM name {}", principal, newPmName);
        principal = loginService.updatePmName(principal.getName(), newPmName);
        cache.put(principal.getToken(), principal);
    }
}