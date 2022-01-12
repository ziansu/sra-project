@java.lang.Override
public void onProject(ru.tcgeo.application.gilib.parser.GIProjectProperties ps) {
    map.ps = ps;
    ru.tcgeo.application.gilib.GIEditLayersKeeper.Instance().ClearLayers();
    ru.tcgeo.application.gilib.models.GIBounds temp = new ru.tcgeo.application.gilib.models.GIBounds(ps.m_projection, ps.m_left, ps.m_top, ps.m_right, ps.m_bottom);
    map.InitBounds(temp.Reprojected(ru.tcgeo.application.gilib.models.GIProjection.WorldMercator()));
    touchControl.InitMap(map);
    map.ps = ps;
}