private void initPaints() {
    this.sectionFontSize = this.sp2px(com.camnter.easyrecyclerviewsidebar.EasyRecyclerViewSidebar.DEFAULT_FONT_SIZE);
    this.letterPaint = new android.graphics.Paint();
    this.letterPaint.setAntiAlias(true);
    this.letterPaint.setTextAlign(Paint.Align.CENTER);
    this.letterPaint.setColor(this.fontColor);
    this.letterPaint.setTextSize(this.sectionFontSize);
}