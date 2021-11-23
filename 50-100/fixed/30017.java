public void dcopy(de.tucottbus.kt.jlab.kernel.JlData idSrc) {
    if (idSrc == null)
        return ;
    
    rinc = idSrc.rinc;
    rwid = idSrc.rwid;
    rofs = idSrc.rofs;
    noffset = idSrc.noffset;
    runit = idSrc.runit;
    cinc = idSrc.cinc;
    cofs = idSrc.cofs;
    cunit = idSrc.cunit;
    vunit = idSrc.vunit;
    vinc = idSrc.vinc;
    nblock = idSrc.nblock;
    descr0 = idSrc.descr0;
    descr1 = idSrc.descr1;
    descr2 = idSrc.descr2;
    descr3 = idSrc.descr3;
    descr4 = idSrc.descr4;
    rtext = idSrc.rtext;
    ftext = idSrc.ftext;
    vrtext = idSrc.vrtext;
}