@java.lang.Override
public boolean execute() {
    lagtable = new operations.LagTable(from, to);
    groups = grouper.group(inputData);
    for (int keygroup = 0; keygroup < (groups.size()); keygroup++) {
        for (table.Record r : groups.get(keygroup)) {
            if (isKey(r)) {
                calcLag(r, keygroup);
            }
        }
    }
    resultData = lagtable.toTable();
    return true;
}