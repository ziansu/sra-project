public void removeItem(int position) {
    try {
        if ((transactions.get(position)) != null) {
            transactions.get(position).delete();
            transactions.remove(position);
        }
        notifyItemRemoved(position);
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        android.widget.Toast.makeText(context, "Не удалось удалить", Toast.LENGTH_LONG).show();
    }
}