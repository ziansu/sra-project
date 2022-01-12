@java.lang.Override
void setMemo(long pos, int memoPoint, boolean failed, nez.ast.Node result, int consumed, int stateValue) {
    long key = longkey(pos, memoPoint, shift);
    int hash = ((int) (key % (memoArray.length)));
    nez.vm.MemoEntryKey m = this.memoArray[hash];
    m.failed = failed;
    m.result = result;
    m.consumed = consumed;
    m.stateValue = stateValue;
    this.CountStored += 1;
}