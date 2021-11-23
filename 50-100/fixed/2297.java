org.xwiki.contrib.dokuwiki.text.internal.input.Folder getCommonRoot() {
    if ((commonRoot) != null) {
        return commonRoot;
    }else {
        org.xwiki.contrib.dokuwiki.text.internal.input.Folder current = root;
        while (((current.getLeafs().size()) <= 0) && ((current.getChilds().size()) <= 1)) {
            current = current.getChilds().get(0);
        } 
        commonRoot = current;
        return commonRoot;
    }
}