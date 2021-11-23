@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if ((getArguments()) != null) {
        mParam1 = getArguments().getString(nmct.howest.be.desproject.ShowMapFragment.ARG_PARAM1);
        mParam2 = getArguments().getString(nmct.howest.be.desproject.ShowMapFragment.ARG_PARAM2);
    }
}