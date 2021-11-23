void initSelectPositions(java.util.List<T> list) {
    if ((list == null) || ((list.size()) == 0)) {
        return ;
    }
    for (int i = 0, size = list.size(); i < size; i++) {
        if (list.get(i).isSelected()) {
            initSelectPosition(i);
        }
    }
}