public void setIndex(java.lang.String index) {
    this.index = index.trim();
    this.uri = de.mpg.imeji.logic.util.ObjectHelper.getURI(de.mpg.imeji.logic.vo.Statement.class, encodeIndex(this.index));
}