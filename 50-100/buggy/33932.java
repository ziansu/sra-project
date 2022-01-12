public void storeToken(java.lang.String token, int treeDepth) throws java.io.IOException {
    if (de.uka.ipd.idaho.goldenGateServer.srs.webPortal.layouts.XsltSearchPortalLayout.html.isEndTag(token))
        tr.storeToken(token, treeDepth);
    else
        if (de.uka.ipd.idaho.goldenGateServer.srs.webPortal.layouts.XsltSearchPortalLayout.html.isSingularTag(token))
            tr.storeToken(token, treeDepth);
        else
            if (de.uka.ipd.idaho.goldenGateServer.srs.webPortal.layouts.XsltSearchPortalLayout.html.isTag(token))
                tr.storeToken(de.uka.ipd.idaho.goldenGateServer.srs.webPortal.layouts.XsltSearchPortalLayout.html.unescape(token), treeDepth);
            else
                tr.storeToken(token, treeDepth);
            
        
    
}