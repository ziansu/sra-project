@java.lang.Override
public void onBackStackChanged() {
    currentFragent = fragmentManager.findFragmentById(fragmentContainerId);
    if ((currentFragent) != null) {
        try {
            if ((currentFragent) instanceof es.shyri.materialtoolbar.MaterialToolbarSupplier)
                toolbar.setContent(((es.shyri.materialtoolbar.MaterialToolbarSupplier) (currentFragent)).getToolbarContent());
            
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
}