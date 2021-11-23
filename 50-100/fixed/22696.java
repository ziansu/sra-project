public void delete(android.content.Context c) {
    de.hsmw.semestermanager.DatabaseInterface di = de.hsmw.semestermanager.DatabaseInterface.getInstance(c);
    di.deletePlanByID(id);
    de.hsmw.semestermanager.Termin[] termine = di.getTermineByPlanID(id);
    if (termine != null) {
        for (de.hsmw.semestermanager.Termin t : termine) {
            t.delete(c);
        }
    }
    de.hsmw.semestermanager.Module[] module = di.getModulesByPlanID(id);
    if (module != null) {
        for (de.hsmw.semestermanager.Module m : module) {
            m.delete(c);
        }
    }
}