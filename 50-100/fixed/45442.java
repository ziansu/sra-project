@java.lang.Override
public void realizarFuncionConPOI(java.util.List<dds.grupo3.POIsSistem.POI> listaPois, dds.grupo3.POIsSistem.POI poi) {
    int i = 0;
    while ((i < (listaPois.size())) && ((listaPois.get(i)) != poi)) {
        if ((listaPois.get(i)) != poi)
            i++;
        
    } 
    if (i != (listaPois.size()))
        listaPois.set(i, this.poiNuevo);
    
}