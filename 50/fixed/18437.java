@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View view = super.onCreateView(inflater, container, savedInstanceState);
    com.github.stakkato95.sprint3.event.EventBus.register(getActivity(), EventBus.EVENT_FILTER_SELECTED, mReceiver);
    return view;
}