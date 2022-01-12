@org.junit.Before
public void setUp() throws java.lang.Exception {
    org.powermock.api.mockito.PowerMockito.mockStatic(com.taobao.weex.utils.WXSoInstallMgrSdk.class);
    org.powermock.api.mockito.PowerMockito.mockStatic(android.text.TextUtils.class);
    org.powermock.api.mockito.PowerMockito.mockStatic(com.taobao.weex.ui.component.WXComponentFactory.class);
    org.powermock.api.mockito.PowerMockito.when(android.text.TextUtils.isEmpty("124")).thenReturn(true);
    org.powermock.api.mockito.PowerMockito.when(com.taobao.weex.utils.WXSoInstallMgrSdk.initSo(null, 1, null)).thenReturn(true);
    com.taobao.weex.WXSDKInstance instance = org.mockito.Mockito.mock(com.taobao.weex.WXSDKInstance.class);
    mWXRenderStatement = new com.taobao.weex.ui.WXRenderStatement(instance);
}