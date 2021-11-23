@java.lang.Override
public int getItemCount() {
    return ((geekList) == null) || ((geekList.getItems()) == null) ? 0 : geekList.getItems().size();
}