@java.lang.Override
public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append(getParentNode().getNiceName()).append(" (").append(context.getString(R.string.slot)).append(" ").append(getSlot()).append(") ").append(" - ").append(getName());
    return sb.toString();
}