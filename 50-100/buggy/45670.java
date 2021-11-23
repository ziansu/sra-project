@java.lang.Override
public void success(com.example.lynx.moviezz.model.get_person_by_id.ResponsePersonById responsePersonById, retrofit.client.Response response) {
    com.example.lynx.moviezz.global.Logg.d("Successful fetched person data");
    personData = responsePersonById;
    com.bumptech.glide.Glide.with(getActivity()).load(((com.example.lynx.moviezz.global.Constants.BASE_SMALL_IMAGE_URL) + (personData.profile_path))).into(ivCirclePerson_FPD);
    pbLoadingPersonInfo_FPD.setVisibility(View.GONE);
    tvPersonTitle_FPD.setText(personData.name);
    detailsTabsAdapter = new com.example.lynx.moviezz.adapter.PersonDetailsTabsAdapter(getChildFragmentManager(), personData);
    vpPerson_FPD.setAdapter(detailsTabsAdapter);
    tabLayout_FPD.setupWithViewPager(vpPerson_FPD);
}