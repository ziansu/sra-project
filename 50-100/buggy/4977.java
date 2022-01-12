@java.lang.Override
public java.lang.String toString() {
    title = ((title) == null) ? "" : title;
    return java.lang.String.format("%s\n%s\n%s\n%s\n%s\n%s\n%s", uri.toString().trim(), title.trim(), fullInfo, shortUrl.trim(), useFavicon, textOption, colorPosition);
}