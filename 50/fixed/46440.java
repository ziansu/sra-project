@java.lang.Override
public void onClick(android.view.View v) {
    if ((onItemClickListener) != null) {
        onItemClickListener.onRootFabClick();
        isOpen = !(isOpen);
        operateChildView(isOpen);
    }
}