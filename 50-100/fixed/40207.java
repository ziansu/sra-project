public boolean removeLink(java.lang.String linkId) {
    edu.isi.karma.rep.alignment.LabeledLink link = this.getLinkById(linkId);
    if (link != null) {
        if (this.graphBuilder.removeLink(link))
            if ((this.steinerTree) != null) {
                this.steinerTree.removeEdge(link);
                return true;
            }
        
    }
    edu.isi.karma.modeling.alignment.Alignment.logger.debug((("Cannot find the link " + linkId) + " in the graph."));
    return false;
}