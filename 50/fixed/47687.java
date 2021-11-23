public void setProfilePicURI(android.net.Uri profilePicURI) {
    com.example.cmput401.classdiscuss.ParseDatabase.getInstance().setUsersImageToParse(this.name, profilePicURI.toString());
    this.profilePicURI = profilePicURI;
}