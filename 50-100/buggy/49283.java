private void SetImage() {
    int v = ((int) (java.lang.Math.ceil(((java.lang.Math.random()) - 0.1))));
    if (SetupClass.isDEBUGGING)
        java.lang.System.out.println(("Engines on:" + ((accelerating) && (v == 1))));
    
    if ((accelerating) && (v == 1))
        setObjectImage(EnginesOn);
    else
        setObjectImage(EnginesOff);
    
}