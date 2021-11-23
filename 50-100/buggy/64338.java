@java.lang.Override
public void loadDB() {
    pm.getPoolUnassigned().addAll(dbf.getAllSubjects());
    java.lang.System.out.println(pm.getPoolUnassigned().size());
    java.util.List<dk.cphbusiness.xpscrumproject.Pool> pool = dbf.getPools();
    pm.setPools(pool.get(0), pool.get(1), pool.get(2), pool.get(3));
}