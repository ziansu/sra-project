@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    getMenuInflater().inflate(R.menu.detail_menu, menu);
    this.changeFilmItem = menu.findItem(R.id.change_film);
    this.changeFilmItem.setVisible(true);
    this.deleteFilmItem = menu.findItem(R.id.delete_film);
    this.deleteFilmItem.setVisible(true);
    this.changeFilmItem.setOnMenuItemClickListener(this);
    this.deleteFilmItem.setOnMenuItemClickListener(this);
    return true;
}