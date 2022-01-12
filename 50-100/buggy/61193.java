@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_persona_circles);
    it.polimi.spf.framework.profile.SPFPersona persona = getIntent().getParcelableExtra("persona");
    it.polimi.spf.app.fragments.personas.PersonasCirclesFragment fragment = it.polimi.spf.app.fragments.personas.PersonasCirclesFragment.newInstance(persona);
    getFragmentManager().beginTransaction().replace(R.id.activity_persona_circles_container, fragment).commit();
    getSupportActionBar().setDisplayHomeAsUpEnabled(true);
}