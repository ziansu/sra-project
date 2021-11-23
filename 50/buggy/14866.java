@java.lang.Override
public android.view.View getView(int i, android.view.View view, android.view.ViewGroup viewGroup) {
    if ((this.itemList.get(i)) == null) {
        setList();
    }
    return this.itemList.get(i);
}