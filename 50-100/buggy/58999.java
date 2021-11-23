public void DeleteBug(int BugIndex) {
    for (browsermator.com.Action A : BugArray.get(BugIndex).ActionsList) {
        if ("Store Link as Variable by XPATH".equals(A.Type)) {
            VarHashMap.remove(A.Variable2);
        }
        if ("Store Links as URL List by XPATH".equals(A.Type)) {
            VarLists.remove(A.Variable2);
        }
    }
    BugArray.remove(BugIndex);
    ResetBugIndexes();
    changes = true;
}