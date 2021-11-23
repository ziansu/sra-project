@java.lang.SuppressWarnings(value = "unchecked")
public java.util.List<com.springmvc.model.Album> findAlbumsByArtist(int artistId) {
    org.hibernate.Criteria criteria = createEntityCriteria();
    criteria.add(org.hibernate.criterion.Restrictions.eq("artistId", java.lang.Integer.toString(artistId)));
    return ((java.util.List<com.springmvc.model.Album>) (criteria.list()));
}