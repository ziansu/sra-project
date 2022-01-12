@java.lang.Override
public void draw(org.reactome.web.diagram.util.AdvancedContext2d ctx, org.reactome.web.diagram.data.layout.DiagramObject item, java.lang.Double factor, org.reactome.web.diagram.data.layout.Coordinate offset) {
    if (!(isVisible(item)))
        return ;
    
    super.draw(ctx, item, factor, offset);
    org.reactome.web.diagram.data.layout.Node node = ((org.reactome.web.diagram.data.layout.Node) (item));
    drawAttachments(ctx, node, factor, offset, true);
}