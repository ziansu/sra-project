private void addFragment() {
    mAnswerImageFragment = com.kania.set2.ui.AnswerImageFragment.newInstance();
    mNineCardFragment = com.kania.set2.ui.NineCardFragment.newInstance(NineCardFragment.CARD_TYPE_FILL_AS_PATTERN, false, this);
    android.app.FragmentManager fragmentManager = getFragmentManager();
    android.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
    fragmentTransaction.add(R.id.timeattack_container_answer, mAnswerImageFragment);
    fragmentTransaction.add(R.id.timeattack_container_ninecard, mNineCardFragment);
    fragmentTransaction.commit();
}