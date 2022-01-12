@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    sensorList = ((com.ohtu.wearable.wearabledataservice.SelectedSensorsInterface) (getActivity())).getSelectedSensors();
    android.view.View view = inflater.inflate(R.layout.fragment_two_layout, container, false);
    android.widget.TextView mTextView = ((android.widget.TextView) (view.findViewById(R.id.textView2)));
    if ((sensorList) != null) {
        mTextView.setText(sensorList.toString());
    }
    return view;
}