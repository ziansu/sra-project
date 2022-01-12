public static com.miz.mizuu.fragments.ActorBiographyFragment newInstance(java.lang.String json, java.lang.String thumbUrl) {
    com.miz.mizuu.fragments.ActorBiographyFragment pageFragment = new com.miz.mizuu.fragments.ActorBiographyFragment();
    android.os.Bundle bundle = new android.os.Bundle();
    bundle.putString("json", json);
    bundle.putString("thumbUrl", thumbUrl);
    pageFragment.setArguments(bundle);
    return pageFragment;
}