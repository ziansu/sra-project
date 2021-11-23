private void openProfileContent() {
    com.me.esztertoth.vetclinicapp.fragments.ClinicDetailsFragment clinicDetailsFragment = new com.me.esztertoth.vetclinicapp.fragments.ClinicDetailsFragment();
    android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
    android.os.Bundle bundle = new android.os.Bundle();
    bundle.putSerializable("clinic", clinic);
    clinicDetailsFragment.setArguments(bundle);
    ft.replace(R.id.clinic_details_container, clinicDetailsFragment);
    ft.commit();
}