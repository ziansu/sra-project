org.opentreeoflife.taxa.Answer assess(org.opentreeoflife.taxa.Taxon subject, org.opentreeoflife.taxa.Taxon target) {
    org.opentreeoflife.taxa.Taxon xdiv = subject.getDivision();
    org.opentreeoflife.taxa.Taxon ydiv = target.getDivision();
    if (xdiv == ydiv)
        return org.opentreeoflife.taxa.Answer.yes(subject, target, "same/division", (xdiv == null ? null : xdiv.name));
    else
        return org.opentreeoflife.taxa.Answer.NOINFO;
    
}