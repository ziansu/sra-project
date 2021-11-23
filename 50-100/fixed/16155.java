@java.lang.Override
public void onAnimationEnd(android.view.animation.Animation animation) {
    com.adi.ho.jackie.versa_news.Fragments.SearchFragment searchFragment = new com.adi.ho.jackie.versa_news.Fragments.SearchFragment();
    android.os.Bundle bundle = new android.os.Bundle();
    bundle.putString("QUERY", mSearchEditText.getText().toString());
    searchFragment.setArguments(bundle);
    searchFragment.query = mSearchEditText.getText().toString();
    android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
    searchFragment.show(getFragmentManager(), mSearchEditText.getText().toString());
}