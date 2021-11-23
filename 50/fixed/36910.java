@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    if (getShowsDialog()) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }else {
        return fillView(inflater, container, savedInstanceState);
    }
}