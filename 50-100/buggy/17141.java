public void displayEndLoadingRow(boolean endLoadingRow) {
    if ((this.endLoadingRow) != endLoadingRow) {
        this.endLoadingRow = endLoadingRow;
        notifyDataSetChanged();
        if (endLoadingRow) {
            notifyItemInserted(((getItemCount()) - 1));
        }else {
            notifyItemRemoved(((getItemCount()) - 1));
        }
    }
}