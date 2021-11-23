@java.lang.Override
public java.lang.String toString() {
    java.lang.String s = new java.lang.String();
    for (int i = 0; i < (this.articles.size()); i++) {
        s += articles.toString();
    }
    return s;
}