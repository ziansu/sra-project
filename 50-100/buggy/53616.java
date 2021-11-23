@java.lang.Override
protected void onCreate(final android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    this.setContentView(R.layout.activity_pets);
    new com.example.patitas.pets.PetsPresenter(com.example.patitas.util.Injection.providePetsRepository(), this.petsFragment);
    butterknife.ButterKnife.bind(this);
    this.addFragmentToPetActivity();
    this.initToolbar();
    com.example.patitas.data.source.FirebasePetsRepository.getInstance();
}