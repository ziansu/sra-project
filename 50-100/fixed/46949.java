public void editElement(fr.obeo.dsl.mindstorms.GoForward travel, java.lang.String value) {
    java.lang.String valueOf = java.lang.String.valueOf(value);
    if ("infinite".equalsIgnoreCase(valueOf)) {
        travel.setInfinite(true);
    }else
        if ("*".equalsIgnoreCase(valueOf)) {
            travel.setInfinite(true);
        }else {
            try {
                int parseInt = java.lang.Integer.parseInt(valueOf);
                travel.setCm(java.lang.Math.abs(parseInt));
                travel.setInfinite(false);
                return ;
            } catch (java.lang.NumberFormatException e) {
            }
        }
    
}