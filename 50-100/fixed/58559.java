@java.lang.Override
public boolean matches(org.jsoup.select.Element root, org.jsoup.select.Element element, int index, int collectionSize, int depth) {
    if ((this.index) < 0)
        return (index == (collectionSize + (this.index))) && (depth == 0);
    
    return (index == (this.index)) && (depth == 0);
}