public void removeProgress() {
    if (((this.listMovies) != null) && ((this.listMovies.size()) > 0)) {
        if ((getItem(((getItemCount()) - 1))) == null) {
            this.listMovies.remove(((getItemCount()) - 1));
            notifyItemRemoved(getItemCount());
        }
    }
}