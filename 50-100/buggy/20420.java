@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if ((getArguments()) != null) {
        name = getArguments().getString(it.polimi.stopit.fragments.ProfileFragment.ARG_NAME);
        java.lang.System.out.println(("" + (name)));
        surname = getArguments().getString(it.polimi.stopit.fragments.ProfileFragment.ARG_SURNAME);
        points = getArguments().getString(it.polimi.stopit.fragments.ProfileFragment.ARG_POINTS);
        imageURL = getArguments().getString(it.polimi.stopit.fragments.ProfileFragment.ARG_IMAGE);
    }
}