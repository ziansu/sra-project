public void removeProgress() {
    if ((getItem(((getItemCount()) - 1))) == null) {
        this.listMovies.remove(((getItemCount()) - 1));
        notifyItemRemoved(getItemCount());
    }
}