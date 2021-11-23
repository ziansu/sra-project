public void removeItem(int position) {
    transactions.remove(position);
    try {
        net.romanitalian.moneytrackerapp.models.Transaction item = net.romanitalian.moneytrackerapp.models.Transaction.load(net.romanitalian.moneytrackerapp.models.Transaction.class, position);
        if (item != null) {
            item.delete();
        }
        notifyItemRemoved(position);
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        android.widget.Toast.makeText(context, "Не удалось удалить", Toast.LENGTH_LONG).show();
    }
}