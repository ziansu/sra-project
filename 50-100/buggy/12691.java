public void link(internetz.Artifact newart) {
    java.util.ArrayList mostsimilar = getMostSimilar(bookmarks, newart);
    while (mostsimilar.iterator().hasNext()) {
        newart.buildLink(((internetz.Artifact) (mostsimilar.iterator().next())));
    } 
}