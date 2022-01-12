public static void updateUserWithPhoto(com.backendless.BackendlessUser user, java.io.File file) throws java.lang.Exception {
    if (file != null) {
        com.backendless.files.BackendlessFile uploadedUserPhoto = Backendless.Files.upload(file, com.example.justicecamera.Helper.USERS_PHOTO_DIRECTORY, com.example.justicecamera.Helper.OVERWRITE);
        java.lang.String photoUrl = uploadedUserPhoto.getFileURL();
        user.setProperty("photoUrl", photoUrl);
    }
    Backendless.UserService.update(user);
}