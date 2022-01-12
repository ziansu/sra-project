@java.lang.Override
public java.util.List<br.com.caelum.vraptor.musicjungle.model.Music> searchSimilarTitle(java.lang.String title) {
    return musics = entityManager.createQuery("select m from Music m where lower(m.title) like lower(:title)", br.com.caelum.vraptor.musicjungle.model.Music.class).setParameter("title", (("%" + title) + "%")).getResultList();
}