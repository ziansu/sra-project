public void updateView(info.arybin.fearnotwords.model.Memorable memorable, int exampleIndex) {
    textViewBody.setText(memorable.getOriginal());
    textViewPronounce.setText(memorable.getPronounce());
    textViewTranslation.setText(memorable.getTranslation());
    info.arybin.fearnotwords.model.Translatable example = memorable.getExampleAt(exampleIndex);
    textViewExampleBody.setText(example.getOriginal());
    textViewExampleTranslation.setText(example.getTranslation());
}