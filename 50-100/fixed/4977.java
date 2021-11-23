@java.lang.Override
public java.lang.String toString() {
    title = ((title) == null) ? "" : title.replace("\n", "");
    shortUrl = shortUrl.replace("\n", "");
    textOption = textOption.replace("\n", "");
    return java.lang.String.format("%s\n%s\n%s\n%s\n%s\n%s\n%s", uri.toString().trim(), title.trim(), fullInfo, shortUrl.trim(), useFavicon, textOption, colorPosition);
}