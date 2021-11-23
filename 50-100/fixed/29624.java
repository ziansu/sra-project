private void apppendImageText(java.lang.StringBuilder sb, no.dusken.momus.model.Article article) {
    java.lang.String text = article.getImageText();
    if ((text == null) || (text.isEmpty())) {
        return ;
    }
    text = text.replaceAll("\n", "\r\n");
    sb.append("<ParaStyle:Bildetekster>").append(text).append("\r\n");
}