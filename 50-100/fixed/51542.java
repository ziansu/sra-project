@java.lang.Override
public void collectWordCount(java.net.URL u, java.lang.String word, int count) {
    java.lang.String strUrl = u.toString();
    print(java.lang.String.format(ru.voronoy.webscraper.Printer.occurrenceTemplate, word, strUrl, count));
    java.lang.Integer c = infoMap.get(strUrl);
    if (c == null)
        c = count;
    else
        c += count;
    
    infoMap.put(strUrl, c);
}