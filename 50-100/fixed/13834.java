@java.lang.Override
public boolean equals(java.lang.Object outroObjeto) {
    if (!(outroObjeto instanceof br.com.vinyanalista.ag.aeroportos.Mapa)) {
        return false;
    }
    br.com.vinyanalista.ag.aeroportos.Mapa outroMapa = ((br.com.vinyanalista.ag.aeroportos.Mapa) (outroObjeto));
    return (aeroportos.equals(outroMapa.aeroportos)) && (cidades.equals(outroMapa.cidades));
}