@java.lang.Override
public int compareTo(final com.bina.varsim.types.variant.Variant other) {
    final int chrCmp = chr.compareTo(other.chr);
    if (chrCmp != 0) {
        return chrCmp;
    }
    return ((getPos()) - (getRef_deleted().length())) - ((other.getPos()) - (other.getRef_deleted().length()));
}