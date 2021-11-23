@org.springframework.web.bind.annotation.RequestMapping(value = "/category/{categoryLink}/{itemId}")
public java.lang.String product(@lombok.NonNull
@org.springframework.web.bind.annotation.PathVariable(value = "categoryLink")
java.lang.String categoryLink, @lombok.NonNull
@org.springframework.web.bind.annotation.PathVariable(value = "itemId")
java.lang.Long itemId, org.springframework.ui.Model model) {
    model.addAttribute("product", itemRepository.findItemByCategoriesIsAndId(categoryRepository.findByLink(("/" + categoryLink)), itemId));
    return "product";
}