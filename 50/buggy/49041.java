@java.lang.Override
public com.diffunit.Diffs addDifference(com.diffunit.DiffObject object) {
    object.setLineNum(line);
    _diffObjects.add(object);
    return this;
}