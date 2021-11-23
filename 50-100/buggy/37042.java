@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_service_details);
    initialiseToolbar();
    android.content.Intent intent = getIntent();
    if (intent.hasExtra(AppConstants.SELECTED_SERVICE)) {
        selectedService = ((com.cloudcommerce.app.datamodels.SubServiceDataModel) (intent.getSerializableExtra(AppConstants.SELECTED_SERVICE)));
    }
    descriptionFragment = com.cloudcommerce.app.fragments.ServiceDetailsFragment.newInstance();
    android.os.Bundle bundle = new android.os.Bundle();
    bundle.putSerializable(AppConstants.SELECTED_SERVICE, selectedService);
    descriptionFragment.setArguments(bundle);
    loadFragment(descriptionFragment, R.id.service_desc_container, "SubServices");
}