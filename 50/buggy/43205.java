@java.lang.Override
public java.lang.Long createForm(dash.dao.FormEntity form) {
    form.setInsertion_date(new java.util.Date());
    entityManager.persist(form);
    entityManager.flush();
    return form.getId();
}