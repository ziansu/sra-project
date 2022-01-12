@java.lang.Override
public void onAnimationEnd(android.view.animation.Animation animation) {
    if ((emojiBackgroundView) != null)
        emojiBackgroundView.setVisibility(View.INVISIBLE);
    
    emojiImagesContainer.setVisibility(View.INVISIBLE);
    selectedEmoji = config.initialSelectedEmoji;
    for (int i = 0; i < (emojiImageViews.size()); i++)
        emojiImageViews.get(i).setLayoutParams(getDefaultLayoutParams(i));
    
}