public void link(internetz.Artifact newart) {
    java.util.ArrayList mostsimilar = getMostSimilar(bookmarks, newart);
    int index = 0;
    while (index < (mostsimilar.size())) {
        newart.buildLink(((internetz.Artifact) (mostsimilar.get(index))));
        index++;
    } 
}