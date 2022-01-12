@java.lang.Override
@org.springframework.transaction.annotation.Transactional
public void cancelBookTour(int idBT, int idTour) {
    this.bookTourDao.cancelBookTour(idBT, idTour);
}