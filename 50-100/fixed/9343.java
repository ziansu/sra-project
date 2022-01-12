@java.lang.Override
public int compare(datastructure.DFSCode e1, datastructure.DFSCode e2) {
    return (e1.a) < (e2.a) ? -1 : (e1.a) == (e2.a) ? (e1.y) < (e2.y) ? -1 : (e1.y) == (e2.y) ? 0 : 1 : 1;
}