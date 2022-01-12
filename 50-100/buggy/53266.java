@java.lang.Override
public void onResponseBase(retrofit2.Call<java.util.List<com.sunarp.inventario.domain.entities.security.Opcion>> call, retrofit2.Response<java.util.List<com.sunarp.inventario.domain.entities.security.Opcion>> response, java.util.List<com.sunarp.inventario.domain.entities.security.Opcion>... items) {
    java.util.List<com.sunarp.inventario.domain.entities.security.Opcion> opciones = (items == null) ? response.body() : items[0];
    BuildMainMenu(opciones);
    getBaseActivity().hideLoader();
}