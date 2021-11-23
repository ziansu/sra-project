@java.lang.Override
public int compareTo(br.edu.ifrn.findyourpro.dominio.Localizacao o) {
    int result = this.cep.compareTo(o.cep);
    if (result == 0) {
        return this.latitude.compareTo(o.latitude);
    }
    if (result == 0) {
        return this.longitude.compareTo(o.longitude);
    }
    return result;
}