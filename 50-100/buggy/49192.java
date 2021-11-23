public void getCategory(boolean onQuote) {
    java.lang.String id = ((testproject.halfmoonstudios.com.ponder.MainActivity) (getActivity())).getSelection();
    android.app.FragmentManager fm = getFragmentManager();
    android.app.Fragment curFragment = fm.findFragmentById(R.id.fragmentContainer);
    if (onQuote) {
        android.util.Log.v("HERE", "HERE");
        mCategoryView.setImageResource(getImageID(id));
    }
}