@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if ((getArguments()) != null) {
        riderName = getArguments().getString(priyanka.edu.cmu.demo.ui.RiderFragment.ARG_PARAM1);
        riderGender = getArguments().getString(priyanka.edu.cmu.demo.ui.RiderFragment.ARG_PARAM2);
        riderPhone = getArguments().getString(priyanka.edu.cmu.demo.ui.RiderFragment.ARG_PARAM3);
        riderSeatNumber = java.lang.Integer.toString(getArguments().getInt(priyanka.edu.cmu.demo.ui.RiderFragment.ARG_PARAM4));
        driverID = getArguments().getInt("driverID");
    }
}