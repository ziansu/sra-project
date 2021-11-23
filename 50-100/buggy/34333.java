public void matches(no.priv.garshol.duke.Record r1, no.priv.garshol.duke.Record r2, double confidence) {
    try {
        for (no.priv.garshol.duke.Property p : idprops)
            for (java.lang.String id1 : r1.getValues(p.getName()))
                for (java.lang.String id2 : r2.getValues(p.getName()))
                    link(id1, id2);
                
            
        
    } catch (java.io.IOException e) {
        throw new no.priv.garshol.duke.DukeException(e);
    }
}