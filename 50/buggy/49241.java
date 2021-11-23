@java.lang.Override
public void onClick(android.view.View view) {
    if (com.fibelatti.accedomemory.helpers.GameHelper.getInstance().addResultListener(this, getAdapterPosition())) {
        setCardFaceUp(true);
    }
}