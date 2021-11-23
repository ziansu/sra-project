public boolean isSuspended() {
    if ((suspensions) != null) {
        for (com.hypersocket.realm.PrincipalSuspension s : suspensions) {
            if (s.isActive()) {
                return true;
            }
        }
    }
    return false;
}