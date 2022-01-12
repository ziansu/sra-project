private void drawTag(java.awt.Graphics g, HtmlTag htmlTag, int yLoc) {
    java.lang.System.out.println(htmlTag.getTag());
    switch (htmlTag.getTag()) {
        case "hr" :
            drawHorizontalRule(g, yLoc);
            break;
        case "vr" :
            drawVerticalRule(g, htmlTag.getHtmlComponentWidth());
            break;
        case "br" :
            break;
    }
}