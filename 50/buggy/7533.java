@java.lang.Override
public void onClick(android.view.View v) {
    savedOriginalPosition = getAdapterPosition();
    savedOriginalVerse = songVerses.get(savedOriginalPosition);
    startLevel();
}