private void startSignIn() {
    if (userAccount.isAnonymous()) {
        ((munoz.pablo.directorio.activities.MainActivity) (getActivity())).changeContentFragment(new munoz.pablo.directorio.fragments.Login());
    }else {
        if ((userAccount.getContractor()) != null) {
            mUsername = userAccount.getContractor().getFullName();
        }else {
            mUsername = userAccount.getEmail();
        }
    }
}