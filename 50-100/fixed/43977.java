@java.lang.Override
public void set(int position, TYP content) {
    if ((isEmpty()) && (position == 1)) {
        currentLink = new Link(null, null, content);
        firstLink = currentLink;
    }else
        if (position <= (size())) {
            iterateCurrentLinkTo(position);
            currentLink.setData(content);
        }else {
            throw new java.lang.IllegalArgumentException("Die angegebene Position ist nicht im Geltungsbereich!");
        }
    
}