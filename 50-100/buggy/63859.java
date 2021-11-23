public void createCinema(com.qa.student.model.Cinema cinema) {
    com.qa.student.model.Cinema checker = em.find(com.qa.student.model.Cinema.class, cinema);
    if (checker == null) {
        com.qa.student.rest.CinemaService.cinemaLogger.info("Cinema not added, already exists");
    }else {
        em.persist(cinema);
        com.qa.student.rest.CinemaService.cinemaLogger.info("Cinema added successfully");
    }
}