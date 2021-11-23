@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    org.jdc.template.App.getInjectComponent(this).inject(this);
    setHasOptionsMenu(true);
    showIndividual();
}