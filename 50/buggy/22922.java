public boolean isPotentialMatchFor(com.example.dindin.User user) {
    try {
        return ((this.matchesPreferences(user)) && (this.isInAgeRange(user))) && (isInPreferredRange(user));
    } catch (java.lang.NullPointerException e) {
        return true;
    }
}