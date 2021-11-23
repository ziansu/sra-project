@java.lang.Override
public void open() {
    super.open();
    if ((view) != null)
        view.waitToBeRealized();
    
}