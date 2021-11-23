@java.lang.Override
public java.awt.Component getListCellRendererComponent(javax.swing.JList<? extends org.oganessian.scholarly.data.objects.Article> jList, org.oganessian.scholarly.data.objects.Article article, int i, boolean b, boolean b1) {
    return new org.oganessian.scholarly.display.elements.results.ArticleResult(article).getArticlePanel();
}