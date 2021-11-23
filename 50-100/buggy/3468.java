protected com.hyena.coretext.blocks.CYTextBlock buildChildBlock(com.hyena.coretext.TextEnv textEnv, android.graphics.Paint paint, android.graphics.Paint.FontMetrics fontMetrics, com.hyena.coretext.blocks.CYTextBlock.Word word) {
    try {
        com.hyena.coretext.blocks.CYTextBlock textBlock = ((com.hyena.coretext.blocks.CYTextBlock) (clone()));
        textBlock.setTextEnv(textEnv);
        textBlock.paint = paint;
        textBlock.fontMetrics = fontMetrics;
        textBlock.word = word;
        return textBlock;
    } catch (java.lang.CloneNotSupportedException e) {
        e.printStackTrace();
    }
    return null;
}