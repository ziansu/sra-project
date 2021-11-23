@java.lang.Override
public java.lang.String concatenarContenido(java.lang.String contenido) {
    return contenido += ("<ul>\n" + (this.construirStringLista())) + "</ul>\n";
}