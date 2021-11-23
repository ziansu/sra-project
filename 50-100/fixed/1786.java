private static ffk27.mapviewer2.GeoDataSource parentDataSource(ffk27.mapviewer2.RenderRule renderRule) {
    if ((renderRule.dataSource) != null) {
        return renderRule.dataSource;
    }else
        if ((renderRule.getParent()) != null) {
            return ffk27.mapviewer2.RenderRule.parentDataSource(renderRule.getParent());
        }
    
    return null;
}