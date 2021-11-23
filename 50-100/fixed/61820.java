@org.springframework.web.bind.annotation.PostMapping(value = "/showPicturesByAuthor")
public java.lang.String showPicturesByAuthor(@org.springframework.web.bind.annotation.RequestParam(value = "authorId")
long authorId, org.springframework.ui.Model model) {
    model.addAttribute("pictures", pictureService.findByAuthor(authorService.findbyId(authorId)));
    model.addAttribute("mostraAzioni", false);
    model.addAttribute("backPage", "history.go(-1);");
    return "pictures";
}