@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable
android.view.ViewGroup container, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    android.view.ViewGroup root = ((android.view.ViewGroup) (inflater.inflate(R.layout.fragment_curve, container, false)));
    if ((mBaseCurveProgressView.getParent()) != null) {
        ((android.view.ViewGroup) (mBaseCurveProgressView.getParent())).removeView(mBaseCurveProgressView);
    }
    root.addView(mBaseCurveProgressView);
    return root;
}