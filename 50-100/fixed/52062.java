private java.util.List<ru.android_studio.pages.entities.PageInfo> pagesByTag(@org.jetbrains.annotations.Nullable
java.lang.Long category, @org.jetbrains.annotations.Nullable
java.lang.String tags) {
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