@org.junit.Before
public void setup() {
    android.content.Context context = android.support.test.InstrumentationRegistry.getTargetContext();
    access = new com.uri.team21.culinarycommrade.DataAccessor(context);
}