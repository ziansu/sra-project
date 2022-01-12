@org.springframework.web.bind.annotation.PostMapping(value = "/delete/{id}")
public java.lang.String deleteProcess(@org.springframework.web.bind.annotation.PathVariable
java.lang.Integer id) {
    if (!(this.albumRepository.exists(id))) {
        return "redirect:/admin/albums/";
    }
    softuniGallery.entity.Album album = this.albumRepository.findOne(id);
    int userId = album.getAuthor().getId();
    this.albumRepository.delete(album);
    return "redirect:/admin/albums/";
}