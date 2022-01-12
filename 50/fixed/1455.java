@java.lang.Override
public boolean apply(com.github.tomakehurst.wiremock.stubbing.StubMapping stubMapping) {
    return (admin.countRequestsMatching(stubMapping.getRequest()).getCount()) == 1;
}