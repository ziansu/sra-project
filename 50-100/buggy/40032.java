@android.support.annotation.NonNull
@java.lang.Override
public android.app.Dialog onCreateDialog(android.os.Bundle savedInstanceState) {
    android.app.Dialog dialog = super.onCreateDialog(savedInstanceState);
    mTodoList = getArguments().getParcelable("item");
    setDescriptionText(mTodoList.getDescription());
    java.util.Date dueDate = new java.util.Date();
    dueDate.setTime(mTodoList.getDueDate());
    onDueDateSelected(dueDate);
    mPriority = mTodoList.getPriority();
    setPriorityText(mTodoList.getPriority().ordinal());
    return dialog;
}