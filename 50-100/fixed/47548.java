public void registerAll(@android.support.annotation.NonNull
final me.drakeet.multitype.TypePool pool) {
    final int size = pool.getClasses().size();
    for (int i = 0; i < size; i++) {
        registerWithoutChecking(pool.getClasses().get(i), pool.getItemViewBinders().get(i), pool.getLinkers().get(i));
    }
}