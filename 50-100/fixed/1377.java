@org.junit.Before
public void prepare() throws java.lang.Exception {
    context = mActivityRule.getActivity();
    if (!(com.bitbucket.lonelydeveloper97.wifiproxysettingslibrary.proxy_change_realisation.NetworkHelper.isWifiConnected(context))) {
        expectedException.expect(com.bitbucket.lonelydeveloper97.wifiproxysettingslibrary.proxy_change_realisation.wifi_network.exceptions.NullWifiConfigurationException.class);
    }
    if (!(com.bitbucket.lonelydeveloper97.wifiproxysettingslibrary.proxy_change_realisation.wifi_network.CurrentProxyChangerGetter.chooseProxyChangerForCurrentApi(context).isProxySetted())) {
        expectedException.expect(com.bitbucket.lonelydeveloper97.wifiproxysettingslibrary.proxy_change_realisation.wifi_network.exceptions.WifiProxyNotSettedException.class);
    }
}