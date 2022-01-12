@java.lang.Override
public int execute(td.olap.computer.data.EmitItem item) {
    java.lang.System.out.println(item.getXid());
    commit(item.getXid());
    return 0;
}