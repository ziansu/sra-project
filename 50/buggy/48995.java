@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    setHasOptionsMenu(true);
    com.defch.blogwbly.util.LogUtil.v(com.defch.blogwbly.fragments.FragmentContainer.TAG, java.lang.Integer.toString(containerLayout.key));
    return inflater.inflate(containerLayout.layoutId, container, false);
}