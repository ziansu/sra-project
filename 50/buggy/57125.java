public java.util.List<it.uniroma3.domain.model.Painting> getOpere() {
    this.opere = paintingFacade.getAll();
    return this.opere;
}