@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.test_frament_layout, container, false);
    getFragmentManager().beginTransaction().add(R.id.testFrame, new bd.edu.ibaisuniv.ibaisuniversity.customicontab.AFragment()).commit();
    return view;
}