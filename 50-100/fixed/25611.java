@java.lang.Override
public void onClick(android.view.View v) {
    final android.app.FragmentManager fragmentManager = getFragmentManager();
    br.com.inmypocket.fragments.CardFragment cardFragment = new br.com.inmypocket.fragments.CardFragment();
    fragmentManager.beginTransaction().setCustomAnimations(R.animator.slide_right_out, R.animator.slide_left_out, R.animator.slide_right_in, R.animator.slide_left_in).addToBackStack(br.com.inmypocket.fragments.VisualizeCardFragment.TAG).replace(R.id.content_frame, cardFragment).commit();
}