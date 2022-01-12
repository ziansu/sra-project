@org.springframework.web.bind.annotation.RequestMapping(value = "pagesBy", method = org.springframework.web.bind.annotation.RequestMethod.GET, produces = "application/json")
public java.util.List<ru.android_studio.pages.entities.PageInfo> pagesByTag(java.lang.Long category, java.lang.String tags) {
    java.lang.String[] namesAsArray = (tags == null) ? null : tags.split(",");
    if (category == null) {
        return pageService.findByTagNames(namesAsArray);
    }else
        if (namesAsArray == null) {
            return pageService.findByCategoryId(category);
        }else {
            return pageService.findByCategoryAndTagNames(category, namesAsArray);
        }
    
}