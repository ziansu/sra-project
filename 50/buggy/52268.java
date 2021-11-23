private java.util.Set<org.ajabshahar.platform.models.Song> findBy(int songId, int personId) {
    return songsRepository.findBy(songId, personId);
}