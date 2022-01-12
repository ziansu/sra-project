@java.lang.Override
public void onViewCreated(android.view.View view, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    android.support.v7.widget.Toolbar toolbar = ((android.support.v7.widget.Toolbar) (getActivity().findViewById(R.id.toolbar)));
    toolbar.setTitle(getResources().getString(R.string.upcoming));
    android.util.Log.e("FrUpcoming", "onViewCreated");
    if (((com.acev.moovies.Config.Main.listaUpcoming) == null) || (com.acev.moovies.Config.Main.listaUpcoming.isEmpty())) {
        obtenerDatos();
    }else {
        crearLista();
    }
}