@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    adapterPresenter.unFavoriteSong(song);
    notifyDataSetChanged();
    viewHolder.favorite.setImageResource(R.drawable.unfavoritebutton);
}