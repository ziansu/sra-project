public void deleteEspecialista() {
    org.pirateatbay.mars.model.Especialista e = especialistaDao.find(especialista.getIdEspecialista());
    especialistaDao.delete(e);
}