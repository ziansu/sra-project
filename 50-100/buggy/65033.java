public static org.openstreetmap.josm.gui.mappaint.LineTextElemStyle create(org.openstreetmap.josm.gui.mappaint.Environment env) {
    org.openstreetmap.josm.gui.mappaint.Cascade c = env.mc.getCascade(env.layer);
    org.openstreetmap.josm.gui.mappaint.Keyword textPos = c.get("text-position", null, org.openstreetmap.josm.gui.mappaint.Keyword.class);
    if ((textPos != null) && (!(org.openstreetmap.josm.tools.Utils.equal(textPos.val, "line"))))
        return null;
    
    org.openstreetmap.josm.gui.mappaint.TextElement text = org.openstreetmap.josm.gui.mappaint.TextElement.create(c, PaintColors.TEXT.get(), false);
    return new org.openstreetmap.josm.gui.mappaint.LineTextElemStyle(c, text);
}