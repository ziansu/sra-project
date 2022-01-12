@java.lang.Override
@android.support.annotation.CallSuper
public void onClick(android.view.View view) {
    if (mode.isActivated()) {
        tracker.check(getAdapterPosition());
        mode.update(tracker.getCheckedItemCount());
        if ((tracker.getCheckedItemCount()) == 0) {
            mode.turnOff();
        }
        determineState();
    }
}