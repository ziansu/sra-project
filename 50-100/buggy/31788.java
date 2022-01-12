@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    mydb.tutoringSession.deleteTutoringSession(cs.dal.krush.tutorFragments.TutorUpcSessionsDetailsFragment.SESSION_ID);
    mydb.close();
    android.os.Bundle bundle = new android.os.Bundle();
    bundle.putInt("USER_ID", cs.dal.krush.tutorFragments.TutorUpcSessionsDetailsFragment.USER_ID);
    cs.dal.krush.tutorFragments.TutorHomeFragment home = new cs.dal.krush.tutorFragments.TutorHomeFragment();
    home.setArguments(bundle);
    android.support.v4.app.FragmentTransaction transaction = getFragmentManager().beginTransaction();
    transaction.replace(R.id.tutor_fragment_container, home);
    transaction.addToBackStack(null);
    transaction.commit();
}