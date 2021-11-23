@java.lang.Override
public void realizarFuncionConPOI(java.util.List<dds.grupo3.POIsSistem.POI> listaPois, dds.grupo3.POIsSistem.POI poi) {
    int i;
    for (i = 0; i < (listaPois.size()); i++) {
        if (listaPois.get(i).equals(poi))
            break;
        
    }
    listaPois.set(i, this.poiNuevo);
}