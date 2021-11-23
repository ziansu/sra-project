public void updateNowCast(java.util.LinkedList<com.oleaarnseth.weathercast.Forecast> nowcast) {
    m_nowcast = nowcast;
    sendNowCast();
}