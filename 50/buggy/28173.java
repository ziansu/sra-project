public void changeStatusOfManga(java.util.List<mvc.model.Manga> mangas, mvc.model.Manga m, java.lang.String old_status, java.lang.String new_status) {
    removeManga(old_status, mangas, m.getTitle());
    service.MangaSaver.saveManga(m, new_status);
}