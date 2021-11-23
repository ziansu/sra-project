@java.lang.Override
public final int getItemCount() {
    return (getAdapterCount()) - (removed);
}