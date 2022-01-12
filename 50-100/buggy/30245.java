@java.lang.Override
public void onCardClick(int position) {
    android.util.Log.d(com.jonathan.james.eric.project_3.SectionPageAdapterActivity.TAG, "onCardClick: opening article detail");
    mManager.beginTransaction().addToBackStack("Sections").add(R.id.section_fragment_container, com.jonathan.james.eric.project_3.ArticleDetailFragment.getInstance(this, this, this, com.jonathan.james.eric.project_3.ArticleListSingleton.getInstance().getSectionArticles().get(position))).commit();
}