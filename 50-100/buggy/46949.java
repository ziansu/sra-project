public void editElement(fr.obeo.dsl.mindstorms.GoForward travel, java.lang.String value) {
    java.lang.String valueOf = java.lang.String.valueOf(value);
    try {
        int parseInt = java.lang.Integer.parseInt(valueOf);
        travel.setCm(java.lang.Math.abs(parseInt));
    } catch (java.lang.NumberFormatException e) {
    }
    if ("infinite".equalsIgnoreCase(valueOf)) {
        travel.setInfinite(true);
    }else
        if ("*".equalsIgnoreCase(valueOf)) {
            travel.setInfinite(true);
        }else {
            travel.setInfinite(false);
        }
    
}