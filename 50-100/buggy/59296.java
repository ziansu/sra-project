@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.fragment_alumno, container, false);
    android.widget.GridView gridView = ((android.widget.GridView) (view.findViewById(R.id.gridView)));
    gridView.setAdapter(new ar.edu.unlp.hermesmarfiltibaldo.ImageAdapter(view.getContext()));
    return view;
}