@java.lang.Override
public int getCount() {
    if ((model) == null) {
        return 0;
    }
    if (isEmpty) {
        return 1;
    }
    return (model.getData().getStudents().size()) + 1;
}