@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    this.setContentView(R.layout.activity_editor);
    butterknife.ButterKnife.bind(this);
    this.setFragment();
    new com.example.patitas.petcreator.PetCreatorPresenter(com.example.patitas.util.Injection.providePetsRepository(), this.petCreatorFragment);
    this.setSupportActionBar(this.toolbar);
}