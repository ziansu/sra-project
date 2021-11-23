@java.lang.Override
public void run() {
    ((android.widget.ListView) (res.findViewById(R.id.settings_list))).setOnItemClickListener(listener);
    setAdapter();
    android.support.v7.widget.Toolbar toolbar = getActivity().findViewById(R.id.toolbar);
    us.dangeru.launcher.fragments.ThreadWatcherFragment.addOptions(toolbar);
}