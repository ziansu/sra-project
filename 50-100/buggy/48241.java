@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable
android.view.ViewGroup container, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.content_day_view, container, false);
    mContext = view.getContext();
    initializeUiComponents(view);
    if ((mSpecifiedTime) != (-1)) {
        scrollTo(mSpecifiedTime);
    }else {
        scrollToToday();
    }
    return view;
}