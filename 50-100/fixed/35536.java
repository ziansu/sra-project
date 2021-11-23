@java.lang.Override
public void imageOpened(spta.ImagePlus arg0) {
    spta.SimplePTA.imp = arg0;
    if ((spta.SimplePTA.mw) != null)
        spta.SimplePTA.mw.imp = spta.SimplePTA.imp;
    
    spta.SimplePTA.ic = spta.SimplePTA.imp.getCanvas();
    spta.SimplePTA.ic.addMouseListener((spta.SimplePTA.ima = new spta.icMouseAdapter(spta.SimplePTA.imp, spta.SimplePTA.roisize, spta.SimplePTA.mw)));
}