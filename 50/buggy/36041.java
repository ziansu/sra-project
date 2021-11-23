@org.junit.Before
public void setUp() {
    if ((viewModel) == null) {
        viewModel = new ru.unn.agile.LengthConvertor.viewmodel.ViewModel(new ru.unn.agile.LengthConvertor.viewmodel.FakeLogger());
    }
}