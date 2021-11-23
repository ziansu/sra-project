@java.lang.Override
public void onAttach(com.example.reseplaneraren2.controllers.nexttrip.Context context) {
    super.onAttach(context);
    try {
        mParent = ((com.example.reseplaneraren2.MainActivity) (context));
    } catch (final java.lang.ClassCastException e) {
        e.printStackTrace();
    }
    journeyPlanner = mParent.getJourneyPlanner();
}