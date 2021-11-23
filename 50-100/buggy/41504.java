protected static <F extends ru.kazantsev.template.fragments.BaseFragment> F show(android.support.v4.app.FragmentManager manager, @android.support.annotation.IdRes
int container, java.lang.Class<F> fragmentClass, java.lang.String key, java.lang.Object obj) {
    return new ru.kazantsev.template.util.FragmentBuilder(manager).newFragment().addToBackStack().putArg(key, obj).replaceFragment(container, fragmentClass);
}