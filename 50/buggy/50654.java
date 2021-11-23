@org.junit.Test
public void test() {
    java.util.ArrayList<rocketDomain.RateDomainModel> rates = rocketBase.RateDAL.getAllRates();
    java.lang.System.out.println(("Rates size: " + (rates.size())));
    assert (rates.size()) > 0;
    assert 1 == 1;
}