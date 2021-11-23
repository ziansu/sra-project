public Models.Unit getOneUnit(java.lang.String uni) {
    Models.Unit unit = null;
    try {
        if ((units.get(uni)) == null)
            throw new java.lang.Exception();
        
        unit = new Models.Unit(uni, units.get(uni));
    } catch (java.lang.Exception e) {
        java.lang.System.out.println("Error can't find unit");
    }
    return unit;
}