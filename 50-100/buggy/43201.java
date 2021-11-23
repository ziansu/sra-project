@java.lang.Override
public int hashCode() {
    int result = mName.hashCode();
    result = (31 * result) + (mPath.hashCode());
    result = (31 * result) + (isFolderish ? 1 : 0);
    return result;
}