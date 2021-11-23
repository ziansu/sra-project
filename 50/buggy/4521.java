@java.lang.Override
public java.lang.String convertToDatabaseColumn(java.util.List<ua.ihor0k.model.Page> pages) {
    return pages.stream().map(Page::getTitle).collect(java.util.stream.Collectors.joining(" → "));
}