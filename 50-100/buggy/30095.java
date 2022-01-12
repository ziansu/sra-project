@java.lang.Override
public boolean equals(java.lang.Object temaObj) {
    es.jab.persistence.model.entities.Tema tema = ((es.jab.persistence.model.entities.Tema) (temaObj));
    return (((this.getId()) == (tema.getId())) && ((this.getNombre()) == (tema.getNombre()))) && ((this.getPregunta()) == (tema.getPregunta()));
}