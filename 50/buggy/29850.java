private java.util.ArrayList<pt.ipp.estg.cmu.models.Nivel> getAllNiveis() {
    return this.mRepository.getAllByCategoria(this.mCategoria.getNome());
}