public long addLiterature(beans.Literature literature) {
    long id = manager.LiteratureManager.literatureList.size();
    literature.setId(id);
    if (manager.LiteratureManager.literatureList.add(literature)) {
        return id;
    }
    return -1;
}