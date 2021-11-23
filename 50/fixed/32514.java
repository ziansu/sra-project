@java.lang.Override
public void undo() {
    grouping.ungroup(groupModule);
    groupModule.close();
    controller.remove(groupModule);
}