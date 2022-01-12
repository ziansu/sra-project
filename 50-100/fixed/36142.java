public void convertAvatar(int friendAvatarDB) {
    switch (friendAvatarDB) {
        case 0 :
            this.setUserProfilePic(com.gabrielemaffoni.toastapp.utils.Static.AVATAR_STANDARD);
            break;
        case 1 :
            this.setUserProfilePic(com.gabrielemaffoni.toastapp.utils.Static.AVATAR1);
            break;
        case 2 :
            this.setUserProfilePic(com.gabrielemaffoni.toastapp.utils.Static.AVATAR2);
            break;
        case 3 :
            this.setUserProfilePic(com.gabrielemaffoni.toastapp.utils.Static.AVATAR3);
            break;
        case 4 :
            this.setUserProfilePic(com.gabrielemaffoni.toastapp.utils.Static.AVATAR4);
            break;
    }
}