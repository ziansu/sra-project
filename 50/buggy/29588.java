public static cn.dreampie.common.Render get(java.lang.String extension) {
    cn.dreampie.common.Render render = cn.dreampie.route.render.RenderFactory.renderMap.get(extension);
    if (render == null) {
        render = cn.dreampie.route.render.RenderFactory.renderMap.get(cn.dreampie.route.render.RenderFactory.defaultExtension).newInstance();
    }
    return render;
}