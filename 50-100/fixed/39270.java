@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    mRoot = ((android.widget.FrameLayout) (inflater.inflate(R.layout.fragment_study_container, container, false)));
    getChildFragmentManager().beginTransaction().add(R.id.fragment_study_container_root, com.hadouken.kanacards.fragment.StudyModeSingleFrontFragment.newInstance(mCardName)).commit();
    return mRoot;
}