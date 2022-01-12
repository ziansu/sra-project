public void prepareData() {
    eraseData();
    gr.aueb.mscis.theater.model.Play amlet = new gr.aueb.mscis.theater.model.Play("Amlet", "William Shakespeare");
    gr.aueb.mscis.theater.model.Play tgm = new gr.aueb.mscis.theater.model.Play("The Glass Menagerie", "Tennessee Williams");
    javax.persistence.EntityManager em = gr.aueb.mscis.theater.persistence.JPAUtil.getCurrentEntityManager();
    javax.persistence.EntityTransaction tx = em.getTransaction();
    tx.begin();
    em.persist(amlet);
    em.persist(tgm);
    tx.commit();
}