@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    view = inflater.inflate(R.layout.fragment_collection, container, false);
    findView();
    setOnClickListener();
    sensorManager = ((android.hardware.SensorManager) (getActivity().getSystemService(Context.SENSOR_SERVICE)));
    sensorListener = new smv.lovearthstudio.com.svmproj.fragment.CollectionFragment.MySensorListener();
    return view;
}