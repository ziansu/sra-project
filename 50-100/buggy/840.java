private void backToFragment(int level) {
    com.jing.app.jjgallery.gdb.view.surf.SurfFragmentTree tree = ftTree;
    android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
    while ((tree != null) && (level != (tree.level))) {
        tree.child = null;
        ft.hide(tree.fragment);
        ft.remove(tree.fragment);
        tree = tree.parent;
    } 
    tree.child = null;
    ft.show(tree.fragment);
    ft.commit();
}