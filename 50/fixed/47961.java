@java.lang.Override
public void onClick(android.view.View v) {
    int adapterPosition = getAdapterPosition();
    com.darurats.baking.models.Step Step = mStepData.get(adapterPosition);
    mClickHandler.onStepClick(Step, adapterPosition);
}