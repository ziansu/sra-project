public void save(it.lucavercelli.photo.FileRecord f) {
    em.merge(f);
}