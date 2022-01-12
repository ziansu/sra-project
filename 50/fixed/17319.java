@java.lang.Override
public void onClick(android.view.View v) {
    int adapterPosition = getAdapterPosition();
    java.lang.String selectedMovie = movies[adapterPosition].getOriginalTitle();
    movieClickHandler.onClick(movies[adapterPosition]);
}