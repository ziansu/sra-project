@com.google.firebase.database.Exclude
public java.lang.Boolean updateLoc(inf8405_tp2.tp2.User user, android.location.Location loc) {
    if (loc != null) {
        if (m_users.contains(user)) {
            this.m_users.get(this.m_users.indexOf(user)).setCurrentLocation(loc);
            return true;
        }
    }
    return false;
}