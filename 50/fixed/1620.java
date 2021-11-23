@br.mackenzie.lfs.crud_spring_hibernate.model.PreRemove
private void removeTagsFromBook() {
    for (br.mackenzie.lfs.crud_spring_hibernate.model.Tag tag : tags) {
        tag.getBooks().remove(this);
    }
}