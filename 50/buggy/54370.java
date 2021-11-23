public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable
android.view.ViewGroup container, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    v = inflater.inflate(R.layout.blueprint_layout, container, false);
    new com.connorboyle.elitetools.GetModulesTask(this).execute(com.connorboyle.elitetools.BlueprintsActivity.MODULES_JSON_URL);
    setupControls();
    return v;
}