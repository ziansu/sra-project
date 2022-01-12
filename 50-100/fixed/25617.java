public void setTextSize(float textSize) {
    com.antonionicolaspina.textimageview.TextImageView.TextProperties tp = texts.get(((texts.size()) - 1));
    tp.scale = 1.0F;
    tp.size = textSize;
    tp.paint.setTextSize(textSize);
    tp.setText(tp.text);
    reclampText();
    invalidate();
}