@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable
android.view.ViewGroup container, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    resId = getArguments().getInt("fraglayout");
    android.view.View view = inflater.inflate(resId, container, false);
    if ((logic) != null) {
        logic.init(getContext(), view, getArguments());
    }
    return view;
}