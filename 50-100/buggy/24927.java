@java.lang.Override
public void onConnectCompleted(java.lang.Exception ex, com.koushikdutta.async.http.AsyncHttpResponse response) {
    send_messages(ex, response);
    org.hola.cdn_sdk.service.request_t resp;
    if ((resp = get_clean()) == null)
        return ;
    
    long req_dur = (java.lang.System.currentTimeMillis()) - (m_starttime);
    m_proxy.set_bitrate(get_url_level(resp.m_path).m_bitrate);
    m_proxy.set_bandwidth(((int) (((m_bytes) * 8000) / req_dur)));
    resp.m_response.proxy(response);
}