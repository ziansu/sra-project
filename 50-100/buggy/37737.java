@java.lang.Override
public int hashCode() {
    int result = super.hashCode();
    result = (31 * result) + ((int) ((offset) ^ ((offset) >>> 32)));
    result = (31 * result) + ((channel) != null ? channel.hashCode() : 0);
    result = (31 * result) + (position);
    result = (31 * result) + (entrySize);
    return result;
}