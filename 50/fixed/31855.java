public static org.jhipster.blog.domain.Entry createEntity(javax.persistence.EntityManager em) {
    org.jhipster.blog.domain.Entry entry = new org.jhipster.blog.domain.Entry().title(org.jhipster.blog.web.rest.EntryResourceIntTest.DEFAULT_TITLE).content(org.jhipster.blog.web.rest.EntryResourceIntTest.DEFAULT_CONTENT).date(org.jhipster.blog.web.rest.EntryResourceIntTest.DEFAULT_DATE);
    return entry;
}