private void DoFrame() {
    ++(m_iFrame);
    server.Moudle.Room.BattleFrameData frameData = new server.Moudle.Room.BattleFrameData();
    frameData.frameIndex = m_iFrame;
    frameData.charCommandList = new java.util.ArrayList<server.Moudle.Room.BattleCharCommand>();
    m_FrameDataList.add(frameData);
    m_CurrentFrameData = frameData;
    ++(m_iCurrentDuringFrame);
    if ((m_iCurrentDuringFrame) >= (m_iSyncRate)) {
        m_iCurrentDuringFrame = 0;
        DoSync();
    }
}