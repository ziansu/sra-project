@br.mackenzie.lfs.crud_spring_hibernate.model.PreRemove
private void removeTagsFromBook() {
    java.lang.System.out.println("Hey! Preremoving stuff from Book. New and running");
    for (br.mackenzie.lfs.crud_spring_hibernate.model.Tag tag : tags) {
        tag.getBooks().remove(this);
    }
}