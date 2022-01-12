public static edu.rosehulman.lix4.petlf.fragments.AccountFragment newInstance(edu.rosehulman.lix4.petlf.models.User currentUser) {
    edu.rosehulman.lix4.petlf.fragments.AccountFragment fragment = new edu.rosehulman.lix4.petlf.fragments.AccountFragment();
    android.os.Bundle args = new android.os.Bundle();
    fragment.setArguments(args);
    return fragment;
}