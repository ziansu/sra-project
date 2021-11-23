@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View root = inflater.inflate(R.layout.fragment_splash, container, false);
    setRetainInstance(true);
    mBus = de.halfbit.tinybus.TinyBus.from(getActivity());
    wheel = ((com.pnikosis.materialishprogress.ProgressWheel) (root.findViewById(R.id.progress_wheel)));
    wheel.setVisibility(View.VISIBLE);
    eu.antoniolopez.android.builtitbigger.request.EndpointsAsyncTask endpointsAsyncTask = new eu.antoniolopez.android.builtitbigger.request.EndpointsAsyncTask(getActivity());
    endpointsAsyncTask.execute("");
    return root;
}