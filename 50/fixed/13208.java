@java.lang.Override
public void onClick(android.view.View view) {
    int adapterPosition = getAdapterPosition();
    if (adapterPosition != 0) {
        callback.onClickStep((adapterPosition - 1));
    }
}