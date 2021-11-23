@java.lang.Override
public boolean equals(java.lang.Object object) {
    if ((this) == object) {
        return true;
    }
    if (!(object instanceof intelligent.wiki.editor.FilesFacadeTest.Obj)) {
        return false;
    }
    intelligent.wiki.editor.FilesFacadeTest.Obj casted = ((intelligent.wiki.editor.FilesFacadeTest.Obj) (object));
    if ((((casted.number) == (number)) && (java.util.Arrays.equals(casted.array, array))) && (casted.list.equals(list))) {
        return true;
    }
    return false;
}