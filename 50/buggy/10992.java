public final void setTileSizeByUV(final float aU, final float aV) {
    m_TileSize.setInPlace(aU, aV);
    setVector2("_UVScale", m_TileSize);
}