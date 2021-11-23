@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.fragment_dialog_info, container);
    pagerAdapterInfo = new tenerife.rutas.jfernandez.rutasdetenerife.PagerAdapterInfo(getChildFragmentManager());
    viewPager = ((android.support.v4.view.ViewPager) (view.findViewById(R.id.pager)));
    viewPager.setAdapter(pagerAdapterInfo);
    return view;
}