public void resetList() {
    com.example.t_ste.resumekings.Fragment_View_Applicants fragment;
    try {
        fragment = ((com.example.t_ste.resumekings.Fragment_View_Applicants) (fm.findFragmentById(R.id.Container_left)));
    } catch (java.lang.Exception e) {
        return ;
    }
    if ((fragment.adapt.mOriginalValues) != null) {
        cachedApplicantProfiles = fragment.adapt.mOriginalValues;
    }
}