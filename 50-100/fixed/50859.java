@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    getActionBar().setDisplayHomeAsUpEnabled(true);
    com.Vshkole.activities.PageActivity.tasks = null;
    com.Vshkole.activities.PageActivity.entity = null;
    setContentView(R.layout.page_view);
    butterknife.ButterKnife.inject(this);
    extractDataFromIntent();
    initializeEntity();
    com.Vshkole.fragments.BookAdditionalInfoFragment bookAdditionalInfoFragment = new com.Vshkole.fragments.BookAdditionalInfoFragment();
    bookAdditionalInfoFragment.setEntity(com.Vshkole.activities.PageActivity.entity, isBook, classId, true);
    dialogFragment = bookAdditionalInfoFragment;
    restoreMe(savedInstanceState);
}