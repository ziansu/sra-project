@java.lang.Override
public void setContent(java.lang.String cont) {
    this.content = cont.replace(com.pawandubey.griffin.DirectoryCrawler.EXCERPT_MARKER, "");
    int excInd = cont.indexOf(com.pawandubey.griffin.DirectoryCrawler.EXCERPT_MARKER);
    excerpt = (excInd > 0) ? cont.substring(0, excInd) : (cont.length()) >= 255 ? cont.substring(0, 255) : cont;
}