@java.lang.Override
public int compareTo(br.edu.ifrn.findyourpro.dominio.Usuario o) {
    int result = 0;
    if ((this.login) != null) {
        result = this.login.compareTo(o.login);
    }else {
        result = 0;
    }
    return result;
}