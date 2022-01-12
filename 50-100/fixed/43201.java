@java.lang.Override
public int hashCode() {
    int result = mName.hashCode();
    result = (31 * result) + ((mPath) != null ? mPath.hashCode() : 0);
    result = (31 * result) + (isFolderish ? 1 : 0);
    return result;
}