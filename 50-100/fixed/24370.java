private static java.lang.String createPupilUsername(java.lang.String firstName, java.lang.String lastName) {
    return (firstName.toLowerCase().charAt(0)) + (lastName.toLowerCase().substring(0, java.lang.Math.min(lastName.length(), ((models.util.db.PupilBank.MaxUsernameLength) - 1))));
}