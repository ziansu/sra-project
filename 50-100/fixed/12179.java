@org.springframework.web.bind.annotation.RequestMapping(value = "/films/addOrUpdate")
public java.lang.String admin_films_addOrUpdate(@org.springframework.web.bind.annotation.RequestParam(value = "id", required = false, defaultValue = "null")
java.lang.String id, org.springframework.ui.Model model) {
    dao.FilmDb filmDb = new dao.FilmDb();
    if (!(id.equals("null"))) {
        org.hibernate.Session session = hibernate.HibernateUtil.getSessionFactory().openSession();
        filmDb = ((dao.FilmDb) (session.createQuery(("from FilmDb f where f.id=" + id)).list().get(0)));
    }
    model.addAttribute("film", filmDb);
    return "admin/films/addOrUpdate";
}