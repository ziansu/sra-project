@java.lang.Override
public void onClick(android.view.View v) {
    if ((onItemClickListener) != null) {
        onItemClickListener.onRootFabClick();
        isOpen = !(isOpen);
        operateChildView(isOpen);
        android.util.Log.i("Tag", "click");
    }
}