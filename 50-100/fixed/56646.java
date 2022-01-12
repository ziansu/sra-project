public static org.naturenet.ui.ProjectDetailFragment newInstance(org.naturenet.data.model.Project p) {
    android.os.Bundle args = new android.os.Bundle();
    args.putParcelable(org.naturenet.ui.ProjectDetailFragment.ARG_PROJECT, p);
    org.naturenet.ui.ProjectDetailFragment frag = new org.naturenet.ui.ProjectDetailFragment();
    frag.setArguments(args);
    frag.setRetainInstance(true);
    return frag;
}