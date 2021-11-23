@java.lang.Override
public void notifyDataSetChanged() {
    for (android.database.DataSetObserver observer : observes) {
        observer.onChanged();
    }
}