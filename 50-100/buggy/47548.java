public void registerAll(@android.support.annotation.NonNull
final me.drakeet.multitype.TypePool pool) {
    for (int i = 0; i < (pool.getClasses().size()); i++) {
        registerWithoutChecking(pool.getClasses().get(i), pool.getItemViewBinders().get(i), pool.getLinkers().get(i));
    }
}