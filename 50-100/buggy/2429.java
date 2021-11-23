@java.lang.Override
public void unregister(HOLDER holder) {
    java.lang.ref.Reference<? extends org.flowcomputing.commons.resgc.Holder<MRES>> ref = resmap.remove(holder.get());
    if (null != ref) {
        refmap.remove(ref);
        holder.clearDestroyer();
    }
    holder.clearDestroyer();
}