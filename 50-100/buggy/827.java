public void createDummyUser() {
    mPrefs = android.preference.PreferenceManager.getDefaultSharedPreferences(this);
    edu.pitt.cs.cs1635.studybuddies.User newUser = new edu.pitt.cs.cs1635.studybuddies.User(mPrefs.getString("username", ""));
    edu.pitt.cs.cs1635.studybuddies.MainActivity.currentUser = newUser;
    edu.pitt.cs.cs1635.studybuddies.MainActivity.currentUser.addFavorite(edu.pitt.cs.cs1635.studybuddies.MainActivity.groups.get(3));
    edu.pitt.cs.cs1635.studybuddies.MainActivity.currentUser.addFavorite(edu.pitt.cs.cs1635.studybuddies.MainActivity.groups.get(6));
    edu.pitt.cs.cs1635.studybuddies.MainActivity.currentUser.addFavorite(edu.pitt.cs.cs1635.studybuddies.MainActivity.groups.get(9));
    (edu.pitt.cs.cs1635.studybuddies.MainActivity.currentUser.c)++;
}