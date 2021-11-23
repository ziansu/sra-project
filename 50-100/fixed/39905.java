public void setup() {
    superActivity = ((be.coenenjonas.spendapp.activities.InputCategoryActivity) (getActivity()));
    persistentController = superActivity.getPersistentController();
    android.widget.Button btnAddMainCategory = ((android.widget.Button) (getView().findViewById(R.id.btn_addMainCategory)));
    btnAddMainCategory.setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
            addMainCategory();
        }
    });
}