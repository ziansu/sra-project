@org.junit.Test(expected = org.springframework.security.access.AccessDeniedException.class)
@org.springframework.security.test.context.support.WithMockUser(username = "servicetester", roles = { "SERVICE" })
public void testGetReservationHistory_WithoutPermissionShouldFail() throws com.at.ac.tuwien.sepm.ss15.edulium.dao.DAOException, com.at.ac.tuwien.sepm.ss15.edulium.domain.validation.ValidationException, com.at.ac.tuwien.sepm.ss15.edulium.service.ServiceException {
    com.at.ac.tuwien.sepm.ss15.edulium.domain.Reservation res = new com.at.ac.tuwien.sepm.ss15.edulium.domain.Reservation();
    reservationService.getReservationHistory(res);
    org.mockito.Mockito.verify(reservationDAO, org.mockito.Mockito.never()).getHistory(res);
}