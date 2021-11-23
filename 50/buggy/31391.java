public void addProgress(boolean errorProgress) {
    this.isErrorProgress = errorProgress;
    this.listMovies.add(null);
    notifyItemInserted(((getItemCount()) - 1));
}