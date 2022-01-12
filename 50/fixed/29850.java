private java.util.ArrayList<pt.ipp.estg.cmu.models.Nivel> getAllNiveis() {
    return mRepository.getAllByCategoria(mCategoria.getNome());
}