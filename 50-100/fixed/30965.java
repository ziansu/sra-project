private void makeSegmentsFromOpaqueRange(int i) {
    assert (m_segments[i]) == null;
    assert (m_ymin[i]) != (cubicchunks.world.OpacityIndex.None);
    assert (m_ymax[i]) != (cubicchunks.world.OpacityIndex.None);
    m_segments[i] = new int[]{ cubicchunks.world.OpacityIndex.packSegment(m_ymin[i], 255) };
}