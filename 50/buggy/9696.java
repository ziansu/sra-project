@org.junit.Before
public void setUp() throws java.lang.Exception {
    org.mockito.MockitoAnnotations.initMocks(this);
    presenter = new com.globant.practice.presenter.SplashPresenter();
    presenter.attachView(mockView);
}